package org.docksidestage.compilespeed.history;

/**
 * @author jflute
 */
public class CompileHistory {

    // ===================================================================================
    //                                                                             JavaDoc
    //                                                                             =======
    // with javadoc
    //    2016-08-20 16:26:33,200 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s412ms
    //    2016-08-20 16:26:33,200 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s268ms
    //    2016-08-20 16:26:33,200 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s314ms
    //    2016-08-20 16:26:33,207 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s331ms
    //    2016-08-20 16:26:35,463 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 122405
    //    2016-08-20 16:26:35,463 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6409630
    //    2016-08-20 16:26:35,464 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437
    // without javadoc
    //    2016-08-20 16:28:37,315 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s437ms
    //    2016-08-20 16:28:37,315 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s236ms
    //    2016-08-20 16:28:37,315 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s266ms
    //    2016-08-20 16:28:37,325 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s313ms
    //    2016-08-20 16:28:38,777 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 64912
    //    2016-08-20 16:28:38,777 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 3289406
    //    2016-08-20 16:28:38,777 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437

    // ===================================================================================
    //                                                                             Imports
    //                                                                             =======
    // plain imports
    //    2016-08-20 13:24:09,595 [main]-DEBUG (PlainTestCase@log():660) - ...Ending compile
    //    2016-08-20 13:24:09,596 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s258ms
    //    2016-08-20 13:24:09,596 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s308ms
    //    2016-08-20 13:24:09,596 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s305ms
    //    2016-08-20 13:24:09,605 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s290ms
    //    2016-08-20 13:24:12,443 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 122443
    //    2016-08-20 13:24:12,443 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6411084
    //    2016-08-20 13:24:12,444 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437
    // organized imports
    //    2016-08-20 13:27:57,458 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s233ms
    //    2016-08-20 13:27:57,458 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s239ms
    //    2016-08-20 13:27:57,459 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s189ms
    //    2016-08-20 13:27:57,465 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s220ms
    //    2016-08-20 13:28:00,138 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 123902
    //    2016-08-20 13:28:00,138 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6510209
    //    2016-08-20 13:28:00,138 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437

    // ===================================================================================
    //                                                                                Tab
    //                                                                               =====
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
