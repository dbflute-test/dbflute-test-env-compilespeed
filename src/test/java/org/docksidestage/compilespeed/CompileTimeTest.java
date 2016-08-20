package org.docksidestage.compilespeed;

import org.docksidestage.compilespeed.analyzer.CompileTimeAnalyzer;
import org.docksidestage.compilespeed.analyzer.FileInfoExtractor;
import org.docksidestage.compilespeed.analyzer.FileInfoExtractor.FileInfo;
import org.docksidestage.compilespeed.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class CompileTimeTest extends UnitContainerTestCase {

    public void test_analyze_compileTime() throws Exception {
        CompileTimeAnalyzer analyzer = new CompileTimeAnalyzer(3, getProjectDir(), msg -> log(msg));
        analyzer.analyzeCompileSpeed();

        FileInfo fileInfo = new FileInfoExtractor(handler -> {
            policeStoryOfJavaClassChase(handler);
        }).extractFileInfo();
        log("Total line count: {}", fileInfo.getTotalLines());
        log("Total word count: {}", fileInfo.getTotalWords());
        log("Total file count: {}", fileInfo.getSourceInfoList().size());
    }
}
