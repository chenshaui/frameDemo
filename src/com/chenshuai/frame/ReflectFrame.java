package com.chenshuai.frame;


import java.io.InputStream;
import java.util.Properties;

public class ReflectFrame {
    public Object getClassObject() throws Exception {
        Properties properties = new Properties();
        ClassLoader classLoader = ReflectFrame.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("com/chenshuai/frame/pro.properties");
        properties.load(inputStream);
        String property = properties.getProperty("className");
        System.out.println(property);
        Class aClass = Class.forName(property);
        Object o = aClass.newInstance();
        return o;

    }
}
