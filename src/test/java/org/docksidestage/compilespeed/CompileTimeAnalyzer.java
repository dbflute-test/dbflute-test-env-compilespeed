package org.docksidestage.compilespeed;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.util.DfTraceViewUtil;

/**
 * @author jflute
 */
public class CompileTimeAnalyzer {

    private final int compileCount;
    private final File projectDir;
    private final Consumer<String> logger;

    public CompileTimeAnalyzer(int compileCount, File projectDir, Consumer<String> logger) {
        this.compileCount = compileCount;
        this.projectDir = projectDir;
        this.logger = logger;
    }

    public void analyzeCompileSpeed() {
        List<Long> costList = new ArrayList<Long>();
        for (int i = 0; i < compileCount; i++) {
            long costMillis = compile();
            costList.add(costMillis);
        }
        int number = 1;
        for (Long costMillis : costList) {
            logger.accept(number + ": " + DfTraceViewUtil.convertToPerformanceView(costMillis));
            ++number;
        }
        double avg = costList.stream().mapToLong(lo -> lo.longValue()).average().getAsDouble();
        logger.accept(" => avg: " + DfTraceViewUtil.convertToPerformanceView(Double.valueOf(avg).intValue()));
    }

    private long compile() {
        logger.accept("");
        SystemScript script = new SystemScript();
        script.setConsoleEncoding("MS932"); // oops for Mac's Java
        long before = System.currentTimeMillis();
        logger.accept("...Beginning compile");
        ProcessResult result = script.execute(projectDir, "maven-compile.sh");
        logger.accept("\n" + result.getConsole());
        logger.accept("...Ending compile");
        long after = System.currentTimeMillis();
        long costMillis = after - before;
        return costMillis;
    }
}
