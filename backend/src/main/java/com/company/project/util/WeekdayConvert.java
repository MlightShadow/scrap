package com.company.project.util;

import java.io.IOException;
import java.lang.reflect.Type;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

public class WeekdayConvert implements ObjectSerializer {
    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features)
            throws IOException {
        Integer value = (Integer) object;
        String text = "";
        switch(value)
        {
            case 1: text = "星期天"; break;
            case 2: text = "星期一"; break;
            case 3: text = "星期二"; break;
            case 4: text = "星期三"; break;
            case 5: text = "星期四"; break;
            case 6: text = "星期五"; break;
            case 7: text = "星期六"; break;
        }
        serializer.write(text);
    }
}