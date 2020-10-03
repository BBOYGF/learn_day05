package com.learn.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String , Date > {

    @Override
    public Date convert(String source) {
        if(source==null)
        {
            throw new RuntimeException("没有数据！");
        }
        Date date=null;
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try {
             date=df.parse(source);
        } catch (ParseException e) {
            throw  new RuntimeException("数据出现异常！");
        }
        return date;
    }
}
