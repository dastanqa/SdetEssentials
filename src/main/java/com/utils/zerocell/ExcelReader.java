package com.utils.zerocell;

import com.creditdatamw.zerocell.Reader;

import java.io.File;
import java.util.List;

public final class ExcelReader {
    private ExcelReader() {
    }

    private static List<TestData> testdatas = null;

    public static List<TestData> getTestdatas() {
        return testdatas;
    }

    static {
        testdatas = Reader.of(TestData.class)
                .from(new File("testdata.xlsx"))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();
    }
}
