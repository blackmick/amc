package com.baidu.fpu.usercenter.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by shawn on 7/28/15.
 */
public class ClassUtil {
    private static Logger logger = LoggerFactory.getLogger(ClassUtil.class);
    public static Object getFieldValueByName(String fieldName, Object o){
        String firstLetter;
        String getter;
        Method method;
        Object value;
        firstLetter = fieldName.substring(0,1).toUpperCase();
        getter = "get" + firstLetter + fieldName.substring(1);

        try {
            method = o.getClass().getMethod(getter, new Class[]{});
            value = method.invoke(o, new Object[]{});
            return value;
        }catch (Exception e){
            try{
                getter = "get" + fieldName;
                method = o.getClass().getMethod(getter, new Class[]{});
                value = method.invoke(o, new Object[]{});
                return value;
            }catch (Exception ex){
                logger.error(ex.getMessage());
                return null;
            }
        }
    }

    public static String toString(Object o){
        String out = "[";
        Field[] fields = o.getClass().getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            out += fields[i].getName();
            out += "=";
            out += ClassUtil.getFieldValueByName(fields[i].getName(), o);
            if (i < fields.length - 1){
                out += ", ";
            }
        }
        out += "]";

        return out;
    }
}
