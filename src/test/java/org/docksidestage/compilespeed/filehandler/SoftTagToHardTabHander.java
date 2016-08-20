package org.docksidestage.compilespeed.filehandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.dbflute.helper.filesystem.FileTextIO;
import org.dbflute.utflute.core.policestory.javaclass.PoliceStoryJavaClassHandler;
import org.dbflute.util.Srl;

/**
 * @author jflute
 */
public class SoftTagToHardTabHander implements PoliceStoryJavaClassHandler {

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

    private String replace(String str, String fromStr, String toStr) {
        return Srl.replace(str, fromStr, toStr);
    }
}
