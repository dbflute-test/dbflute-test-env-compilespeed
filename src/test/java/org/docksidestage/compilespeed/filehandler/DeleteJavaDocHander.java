package org.docksidestage.compilespeed.filehandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.dbflute.helper.filesystem.FileTextIO;
import org.dbflute.helper.filesystem.FileTextLineFilter;
import org.dbflute.utflute.core.policestory.javaclass.PoliceStoryJavaClassHandler;
import org.dbflute.util.Srl;

/**
 * @author jflute
 */
public class DeleteJavaDocHander implements PoliceStoryJavaClassHandler {

    public void handle(File srcFile, Class<?> clazz) {
        FileTextIO textIO = new FileTextIO().encodeAsUTF8();
        try {
            String text = textIO.readFilteringLine(new FileInputStream(srcFile), new FileTextLineFilter() {
                private boolean inJavaDoc;

                @Override
                public String filter(String line) {
                    if (line.trim().startsWith("/*")) {
                        inJavaDoc = true;
                    }
                    if (inJavaDoc && line.contains("*/")) {
                        inJavaDoc = false;
                        String rear = Srl.substringFirstRear(line, "*/");
                        return rear.trim().length() > 0 ? rear : null;
                    }
                    if (inJavaDoc) {
                        return null;
                    } else {
                        return line;
                    }
                }
            });
            textIO.write(new FileOutputStream(srcFile), text);
        } catch (FileNotFoundException e) {
            throw new IllegalStateException("Failed to read the file: " + srcFile, e);
        }
    }
}
