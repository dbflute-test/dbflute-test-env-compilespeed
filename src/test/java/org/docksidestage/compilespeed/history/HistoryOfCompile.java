package org.docksidestage.compilespeed.history;

/**
 * @author jflute
 */
public class HistoryOfCompile {

    // ===================================================================================
    //                                                                          ForeignKey
    //                                                                          ==========
    // without FK
    //    2016-08-20 16:36:27,847 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m02s236ms
    //    2016-08-20 16:36:27,847 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m02s313ms
    //    2016-08-20 16:36:27,847 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m02s244ms
    //    2016-08-20 16:36:27,859 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m02s264ms
    //    2016-08-20 16:36:29,812 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 114224
    //    2016-08-20 16:36:29,812 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 5950029
    //    2016-08-20 16:36:29,812 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 428

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
    //    2016-08-20 17:07:47,113 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s124ms
    //    2016-08-20 17:07:47,113 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s479ms
    //    2016-08-20 17:07:47,114 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s612ms
    //    2016-08-20 17:07:47,120 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s738ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s569ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s585ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s657ms
    //    2016-08-20 17:04:07,189 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s937ms
    //    2016-08-20 17:04:07,189 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 122443
    //    2016-08-20 17:04:07,189 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6411084
    //    2016-08-20 17:04:07,189 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437
    // hard tab
    //    2016-08-20 17:02:42,205 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m09s783ms
    //    2016-08-20 17:02:42,205 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s979ms
    //    2016-08-20 17:02:42,205 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s712ms
    //    2016-08-20 17:02:42,210 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s491ms
    //    2016-08-20 16:59:21,633 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s730ms
    //    2016-08-20 16:59:21,633 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s790ms
    //    2016-08-20 16:59:21,633 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s416ms
    //    2016-08-20 16:59:21,640 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s645ms
    //    2016-08-20 16:57:55,798 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s671ms
    //    2016-08-20 16:57:55,798 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m09s753ms
    //    2016-08-20 16:57:55,798 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m11s208ms
    //    2016-08-20 16:57:55,807 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s877ms
    //    2016-08-20 16:57:55,807 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 122443
    //    2016-08-20 16:57:55,808 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6118050
    //    2016-08-20 16:57:55,808 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437
}
