package org.docksidestage.compilespeed;

import org.docksidestage.compilespeed.FileInfoExtractor.FileInfo;
import org.docksidestage.compilespeed.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class AnalyzeCompileTimeTest extends UnitContainerTestCase {

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

    // soft tab
    //    2016-08-16 17:01:10,935 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s212ms
    //    2016-08-16 17:01:10,935 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s152ms
    //    2016-08-16 17:01:10,935 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s235ms
    //    2016-08-16 17:01:10,943 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s199ms
    //    2016-08-16 16:59:47,903 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s997ms
    //    2016-08-16 16:59:47,903 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s178ms
    //    2016-08-16 16:59:47,903 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s192ms
    //    2016-08-16 16:59:47,912 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s455ms
    //    2016-08-16 16:59:50,235 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 122443
    //    2016-08-16 16:59:50,235 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6403669
    //    2016-08-16 16:59:50,235 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437

    // hard tab
    //    2016-08-16 16:58:21,590 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s271ms
    //    2016-08-16 16:58:21,590 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s162ms
    //    2016-08-16 16:58:21,590 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s211ms
    //    2016-08-16 16:58:21,600 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s214ms
    //    2016-08-16 16:57:28,414 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s186ms
    //    2016-08-16 16:57:28,414 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s209ms
    //    2016-08-16 16:57:28,414 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s199ms
    //    2016-08-16 16:57:28,423 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s198ms
    //    2016-08-16 16:57:30,606 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 122443
    //    2016-08-16 16:57:30,607 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6110635
    //    2016-08-16 16:57:30,607 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437
}
