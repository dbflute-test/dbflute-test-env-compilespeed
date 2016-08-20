package org.docksidestage.compilespeed.analyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.dbflute.helper.filesystem.FileTextIO;
import org.dbflute.utflute.core.policestory.javaclass.PoliceStoryJavaClassHandler;
import org.dbflute.util.Srl;

/**
 * @author jflute
 */
public class FileInfoExtractor {

    private final Consumer<PoliceStoryJavaClassHandler> policeStory;

    public FileInfoExtractor(Consumer<PoliceStoryJavaClassHandler> policeStory) {
        this.policeStory = policeStory;
    }

    public FileInfo extractFileInfo() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        policeStory.accept(new PoliceStoryJavaClassHandler() {
            public void handle(File srcFile, Class<?> clazz) {
                FileTextIO textIO = new FileTextIO().encodeAsUTF8();
                try {
                    String text = textIO.read(new FileInputStream(srcFile));
                    int lineCount = Srl.count(text, "\n");
                    int wordCount = text.length();
                    Map<String, Object> resultMap = new HashMap<>();
                    resultMap.put("clazz", clazz);
                    resultMap.put("lineCount", lineCount);
                    resultMap.put("wordCount", wordCount);
                    resultList.add(resultMap);
                } catch (FileNotFoundException e) {
                    throw new IllegalStateException("Failed to read the file: " + srcFile, e);
                }
            }
        });
        int totalLines = 0;
        int totalWords = 0;
        List<JavaSourceInfo> sourceInfoList = new ArrayList<>();
        for (Map<String, Object> resultMap : resultList) {
            Class<?> clazz = (Class<?>) resultMap.get("clazz");
            int lineCount = (int) resultMap.get("lineCount");
            int wordCount = (int) resultMap.get("wordCount");
            totalLines = totalLines + lineCount;
            totalWords = totalWords + wordCount;
            sourceInfoList.add(new JavaSourceInfo(clazz, lineCount, wordCount));
        }
        return new FileInfo(totalLines, totalWords, sourceInfoList);
    }

    public static class FileInfo {

        private final int totalLines;
        private final int totalWords;
        private final List<JavaSourceInfo> sourceInfoList;

        public FileInfo(int totalLines, int totalWords, List<JavaSourceInfo> sourceInfoList) {
            this.totalLines = totalLines;
            this.totalWords = totalWords;
            this.sourceInfoList = sourceInfoList;
        }

        public int getTotalLines() {
            return totalLines;
        }

        public int getTotalWords() {
            return totalWords;
        }

        public List<JavaSourceInfo> getSourceInfoList() {
            return sourceInfoList;
        }
    }

    public static class JavaSourceInfo {

        private final Class<?> sourceType;
        private final int lineCount;
        private final int wordCount;

        public JavaSourceInfo(Class<?> sourceType, int lineCount, int wordCount) {
            this.sourceType = sourceType;
            this.lineCount = lineCount;
            this.wordCount = wordCount;
        }

        public Class<?> getSourceType() {
            return sourceType;
        }

        public int getLineCount() {
            return lineCount;
        }

        public int getWordCount() {
            return wordCount;
        }
    }
}
