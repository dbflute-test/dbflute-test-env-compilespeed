package org.docksidestage.compilespeed.history;

/**
 * @author jflute
 */
public class HistoryOfCompile {

    // ===================================================================================
    //                                                                     Condition Query
    //                                                                     ===============
    // reduced query
    //    2016-08-20 17:47:17,285 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s544ms
    //    2016-08-20 17:47:17,285 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m11s055ms
    //    2016-08-20 17:47:17,285 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s123ms
    //    2016-08-20 17:47:17,291 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s574ms
    //    2016-08-20 17:44:28,861 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s886ms
    //    2016-08-20 17:44:28,861 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s892ms
    //    2016-08-20 17:44:28,861 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s879ms
    //    2016-08-20 17:44:28,870 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s885ms
    //    2016-08-20 17:43:32,379 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s447ms
    //    2016-08-20 17:43:32,379 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s397ms
    //    2016-08-20 17:43:32,379 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s650ms
    //    2016-08-20 17:43:32,384 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s498ms
    //    2016-08-20 17:42:35,101 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s209ms
    //    2016-08-20 17:42:35,102 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s135ms
    //    2016-08-20 17:42:35,102 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m11s003ms
    //    2016-08-20 17:42:35,111 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s449ms
    //    2016-08-20 17:41:07,641 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s489ms
    //    2016-08-20 17:41:07,641 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s700ms
    //    2016-08-20 17:41:07,641 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m11s214ms
    //    2016-08-20 17:41:07,649 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s801ms

    // ===================================================================================
    //                                                                          ForeignKey
    //                                                                          ==========
    // without FK
    //    2016-08-20 17:36:43,408 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s465ms
    //    2016-08-20 17:36:43,408 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s750ms
    //    2016-08-20 17:36:43,408 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m09s939ms
    //    2016-08-20 17:36:43,414 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s384ms
    //    2016-08-20 17:35:40,588 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s259ms
    //    2016-08-20 17:35:40,588 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m09s878ms
    //    2016-08-20 17:35:40,589 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m09s730ms
    //    2016-08-20 17:35:40,596 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m09s955ms
    //    2016-08-20 17:34:28,558 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s684ms
    //    2016-08-20 17:34:28,558 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s075ms
    //    2016-08-20 17:34:28,558 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s299ms
    //    2016-08-20 17:34:28,563 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s352ms
    //    2016-08-20 17:33:05,535 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s946ms
    //    2016-08-20 17:33:05,536 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s145ms
    //    2016-08-20 17:33:05,536 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m09s970ms
    //    2016-08-20 17:33:05,542 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s353ms
    //    2016-08-20 17:33:05,542 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 114224
    //    2016-08-20 17:33:05,542 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 5950029
    //    2016-08-20 17:33:05,542 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 428

    // ===================================================================================
    //                                                                             JavaDoc
    //                                                                             =======
    // without javadoc
    //    2016-08-20 17:23:52,830 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s867ms
    //    2016-08-20 17:23:52,830 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s341ms
    //    2016-08-20 17:23:52,831 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s042ms
    //    2016-08-20 17:23:52,838 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s416ms
    //    2016-08-20 17:22:30,288 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s481ms
    //    2016-08-20 17:22:30,288 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s285ms
    //    2016-08-20 17:22:30,288 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s168ms
    //    2016-08-20 17:22:30,294 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s311ms
    //    2016-08-20 17:20:58,505 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s806ms
    //    2016-08-20 17:20:58,505 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s408ms
    //    2016-08-20 17:20:58,506 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s440ms
    //    2016-08-20 17:20:58,513 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s884ms
    //    2016-08-20 17:18:22,911 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s607ms
    //    2016-08-20 17:18:22,911 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s146ms
    //    2016-08-20 17:18:22,911 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s288ms
    //    2016-08-20 17:18:22,917 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s347ms
    //    2016-08-20 17:18:22,917 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 64912
    //    2016-08-20 17:18:22,917 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 3289406
    //    2016-08-20 17:18:22,918 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437

    // ===================================================================================
    //                                                                             Imports
    //                                                                             =======
    // organized imports
    //    2016-08-20 17:15:03,209 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s466ms
    //    2016-08-20 17:15:03,210 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m11s308ms
    //    2016-08-20 17:15:03,210 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s752ms
    //    2016-08-20 17:15:03,216 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s842ms
    //    2016-08-20 17:12:37,139 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s561ms
    //    2016-08-20 17:12:37,139 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s346ms
    //    2016-08-20 17:12:37,139 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s948ms
    //    2016-08-20 17:12:37,145 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s618ms
    //    2016-08-20 17:12:37,145 [main]-DEBUG (PlainTestCase@log():660) - Total line count: 123902
    //    2016-08-20 17:12:37,146 [main]-DEBUG (PlainTestCase@log():660) - Total word count: 6510209
    //    2016-08-20 17:12:37,146 [main]-DEBUG (PlainTestCase@log():660) - Total file count: 437

    // ===================================================================================
    //                                                                                Tab
    //                                                                               =====
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
