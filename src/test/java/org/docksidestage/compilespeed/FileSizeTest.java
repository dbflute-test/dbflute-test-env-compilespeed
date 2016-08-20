package org.docksidestage.compilespeed;

import org.docksidestage.compilespeed.analyzer.FileInfoExtractor;
import org.docksidestage.compilespeed.analyzer.FileInfoExtractor.FileInfo;
import org.docksidestage.compilespeed.filehandler.DeleteJavaDocHander;
import org.docksidestage.compilespeed.filehandler.SoftTagToHardTabHander;
import org.docksidestage.compilespeed.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class FileSizeTest extends UnitContainerTestCase {

    public void test_show_current_fileSize() throws Exception {
        showFileInfo();
    }

    public void test_analyze_hardtab() {
        showFileInfo();
        convertSofttabToHardtab();
        showFileInfo();
    }

    public void test_analyze_nonjavadoc() {
        showFileInfo();
        deleteJavaDoc();
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
        policeStoryOfJavaClassChase(new SoftTagToHardTabHander());
    }

    private void deleteJavaDoc() {
        policeStoryOfJavaClassChase(new DeleteJavaDocHander());
    }
}
