package com.utils.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class PhoneNumberProcessor implements Converter<String> {
    @Override
    public String convert(String value, String s1, int i) {
        return value.startsWith("+996")?value:"+996"+value;
    }
}
