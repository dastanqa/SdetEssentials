package com.utils.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToInteger implements Converter<Integer> {


    @Override
    public Integer convert(String value, String column, int row) {
        return Integer.parseInt(value);
    }
}
