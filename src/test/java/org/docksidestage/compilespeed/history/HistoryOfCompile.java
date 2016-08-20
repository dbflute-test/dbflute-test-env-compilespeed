package org.docksidestage.compilespeed.history;

/**
 * @author jflute
 */
public class HistoryOfCompile {

    // ===================================================================================
    //                                                                     Condition Query
    //                                                                     ===============
    // plain
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
    //
    // reduced query
    //    2016-08-20 17:54:53,766 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s537ms
    //    2016-08-20 17:54:53,766 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s784ms
    //    2016-08-20 17:54:53,767 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s456ms
    //    2016-08-20 17:54:53,773 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s592ms
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
    // plain
    //    2016-08-20 17:48:24,435 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s726ms
    //    2016-08-20 17:48:24,436 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s647ms
    //    2016-08-20 17:48:24,436 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m11s266ms
    //    2016-08-20 17:48:24,443 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m11s213ms
    //    2016-08-20 17:26:53,325 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s465ms
    //    2016-08-20 17:26:53,326 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m11s718ms
    //    2016-08-20 17:26:53,326 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s692ms
    //    2016-08-20 17:26:53,332 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s958ms
    //
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
    // plain
    //    2016-08-20 17:26:53,325 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s465ms
    //    2016-08-20 17:26:53,326 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m11s718ms
    //    2016-08-20 17:26:53,326 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s692ms
    //    2016-08-20 17:26:53,332 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s958ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s921ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s810ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s673ms
    //    2016-08-20 17:17:11,173 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s801ms
    //
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
    // plain
    //    2016-08-20 17:56:03,062 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s718ms
    //    2016-08-20 17:56:03,062 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s857ms
    //    2016-08-20 17:56:03,062 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m11s493ms
    //    2016-08-20 17:56:03,069 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m11s022ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s921ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s810ms
    //    2016-08-20 17:17:11,166 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s673ms
    //    2016-08-20 17:17:11,173 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s801ms
    //    2016-08-20 17:07:47,113 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s124ms
    //    2016-08-20 17:07:47,113 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s479ms
    //    2016-08-20 17:07:47,114 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s612ms
    //    2016-08-20 17:07:47,120 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s738ms
    //
    // organized imports
    //    2016-08-20 17:53:11,756 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s677ms
    //    2016-08-20 17:53:11,756 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s401ms
    //    2016-08-20 17:53:11,756 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m11s140ms
    //    2016-08-20 17:53:11,763 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s739ms
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
    // plain
    //    2016-08-20 18:02:31,261 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s628ms
    //    2016-08-20 18:02:31,261 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s754ms
    //    2016-08-20 18:02:31,261 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s228ms
    //    2016-08-20 18:02:31,266 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s870ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s569ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s585ms
    //    2016-08-20 17:04:07,182 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s657ms
    //    2016-08-20 17:04:07,189 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s937ms
    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s375ms
    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s269ms
    //    2016-08-20 16:52:40,046 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s862ms
    //    2016-08-20 16:52:40,053 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s835ms
    //
    // hard tab
    //    2016-08-20 18:01:23,714 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m11s290ms
    //    2016-08-20 18:01:23,714 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m10s869ms
    //    2016-08-20 18:01:23,715 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s379ms
    //    2016-08-20 18:01:23,721 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s846ms
    //    2016-08-20 18:00:13,124 [main]-DEBUG (PlainTestCase@log():660) - 1: 00m10s804ms
    //    2016-08-20 18:00:13,125 [main]-DEBUG (PlainTestCase@log():660) - 2: 00m09s805ms
    //    2016-08-20 18:00:13,125 [main]-DEBUG (PlainTestCase@log():660) - 3: 00m10s449ms
    //    2016-08-20 18:00:13,130 [main]-DEBUG (PlainTestCase@log():660) -  => avg: 00m10s352ms
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
