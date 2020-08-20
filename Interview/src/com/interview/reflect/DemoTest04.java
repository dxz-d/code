package com.interview.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @description  我们可以利用反射和配置文件，程序更新时，对源码无需进行任何修改
 * 我们只需要将新类发给客户端，修改配置文件即可
 * @author diaoxiuze
 * @date 2020/7/22 17:30
 */  
public class DemoTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取Class对象
        Class.forName(getValue("className"));
    }

    public static String getValue(String key) throws IOException {
        // 获取配置文件的对象
        Properties properties = new Properties();
        // 获取输入流
        FileReader fileReader = new FileReader("pro.tex");
        // 将流加载到配置文件对象中
        properties.load(fileReader);
        fileReader.close();
        return properties.getProperty(key)
    }
}
