package com.interview.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @description  ���ǿ������÷���������ļ����������ʱ����Դ����������κ��޸�
 * ����ֻ��Ҫ�����෢���ͻ��ˣ��޸������ļ�����
 * @author diaoxiuze
 * @date 2020/7/22 17:30
 */  
public class DemoTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
        // ͨ�������ȡClass����
        Class.forName(getValue("className"));
    }

    public static String getValue(String key) throws IOException {
        // ��ȡ�����ļ��Ķ���
        Properties properties = new Properties();
        // ��ȡ������
        FileReader fileReader = new FileReader("pro.tex");
        // �������ص������ļ�������
        properties.load(fileReader);
        fileReader.close();
        return properties.getProperty(key)
    }
}
