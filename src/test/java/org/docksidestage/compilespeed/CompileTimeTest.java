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

    //    2016-08-20 18:42:32,913 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s762ms
    //    2016-08-20 18:42:32,913 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s750ms
    //    2016-08-20 18:42:32,913 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s836ms
    //    2016-08-20 18:42:32,920 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m11s116ms
    //    2016-08-20 17:56:03,062 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s718ms
    //    2016-08-20 17:56:03,062 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s857ms
    //    2016-08-20 17:56:03,062 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m11s493ms
    //    2016-08-20 17:56:03,069 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m11s022ms
    //    2016-08-20 17:48:24,435 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s726ms
    //    2016-08-20 17:48:24,436 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s647ms
    //    2016-08-20 17:48:24,436 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m11s266ms
    //    2016-08-20 17:48:24,443 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m11s213ms
    //    2016-08-20 17:26:53,325 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s465ms
    //    2016-08-20 17:26:53,326 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m11s718ms
    //    2016-08-20 17:26:53,326 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s692ms
    //    2016-08-20 17:26:53,332 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s958ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s921ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s810ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s673ms
    //    2016-08-20 17:17:11,173 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s801ms
    //    2016-08-20 17:07:47,113 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s124ms
    //    2016-08-20 17:07:47,113 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s479ms
    //    2016-08-20 17:07:47,114 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s612ms
    //    2016-08-20 17:07:47,120 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s738ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s569ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s585ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s657ms
    //    2016-08-20 17:04:07,189 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s937ms
    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s375ms
    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s269ms
    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s862ms
    //    2016-08-20 16:52:40,053 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s835ms
    //    2016-08-20 16:52:40,054 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 122443
    //    2016-08-20 16:52:40,054 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6411084
    //    2016-08-20 16:52:40,054 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437
}
