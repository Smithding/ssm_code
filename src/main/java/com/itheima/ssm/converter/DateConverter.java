package com.itheima.ssm.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String,Date>{

    @Override
    public Date convert(String source) {

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = format.parse(source);
            return parse;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
