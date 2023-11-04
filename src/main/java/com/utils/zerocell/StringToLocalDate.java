package com.utils.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

import java.time.LocalDate;

public class StringToLocalDate implements Converter<LocalDate> {
    @Override
    public LocalDate convert(String value, String s1, int i) {
        return LocalDate.now();
    }
}
