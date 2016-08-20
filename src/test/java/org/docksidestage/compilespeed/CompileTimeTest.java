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
        // previously extract it to avoid NoClassDefFoundError
        FileInfoExtractor extractor = new FileInfoExtractor(handler -> {
            policeStoryOfJavaClassChase(handler);
        });
        FileInfo fileInfo = extractor.extractFileInfo();

        CompileTimeAnalyzer analyzer = new CompileTimeAnalyzer(3, getProjectDir(), msg -> log(msg));
        analyzer.analyzeCompileSpeed();

        log("Total line count: {}", fileInfo.getTotalLines());
        log("Total word count: {}", fileInfo.getTotalWords());
        log("Total file count: {}", fileInfo.getSourceInfoList().size());
    }

    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s375ms
    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s269ms
    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s862ms
    //    2016-08-20 16:52:40,053 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s835ms
    //    2016-08-20 16:52:40,054 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 122443
    //    2016-08-20 16:52:40,054 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6411084
    //    2016-08-20 16:52:40,054 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437
}
