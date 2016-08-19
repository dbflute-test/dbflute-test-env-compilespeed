package org.docksidestage.compilespeed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.dbflute.helper.filesystem.FileTextIO;
import org.dbflute.utflute.core.policestory.javaclass.PoliceStoryJavaClassHandler;
import org.docksidestage.compilespeed.FileInfoExtractor.FileInfo;
import org.docksidestage.compilespeed.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class AnalyzeFileSizeTest extends UnitContainerTestCase {

    public void test_show_current_fileSize() throws Exception {
        showFileInfo();
    }

    public void test_analyze_hardtab() {
        showFileInfo();
        convertSofttabToHardtab();
        showFileInfo();
    }

    private void showFileInfo() {
        FileInfo fileInfo = new FileInfoExtractor(handler -> {
            policeStoryOfJavaClassChase(handler);
        }).extractFileInfo();
        log("Total line count: {}", fileInfo.getTotalLines());
        log("Total word count: {}", fileInfo.getTotalWords());
        log("Total file count: {}", fileInfo.getSourceInfoList().size());
    }

    private void convertSofttabToHardtab() {
        policeStoryOfJavaClassChase(new PoliceStoryJavaClassHandler() {
            public void handle(File srcFile, Class<?> clazz) {
                FileTextIO textIO = new FileTextIO().encodeAsUTF8();
                try {
                    String text = textIO.read(new FileInputStream(srcFile));
                    text = replace(text, "\n    ", "\n\t");
                    text = replace(text, "\t    ", "\t\t");
                    text = replace(text, "\t    ", "\t\t");
                    text = replace(text, "\t    ", "\t\t");
                    text = replace(text, "\t    ", "\t\t");
                    text = replace(text, "\t    ", "\t\t");
                    text = replace(text, "\t    ", "\t\t");
                    text = replace(text, "\t    ", "\t\t");
                    text = replace(text, "\t    ", "\t\t");
                    text = replace(text, "\t    ", "\t\t");
                    textIO.write(new FileOutputStream(srcFile), text);
                } catch (FileNotFoundException e) {
                    throw new IllegalStateException("Failed to read the file: " + srcFile, e);
                }
            }
        });
    }
}
