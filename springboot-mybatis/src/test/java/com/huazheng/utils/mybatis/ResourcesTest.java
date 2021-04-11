package com.huazheng.utils.mybatis;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;


/**
 * @author zhanghuazheng
 * @title: ResourcesTest
 * @projectName springboot-study
 * @description: TODO
 * @date 2021/4/11 19:31
 */
class ResourcesTest {

    @Test
    void getResourceAsStream() {
        String path = "sqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        System.out.println("文件输入流resourceAsStream "+ resourceAsStream);
    }

    @Test
    void xmlpraseTest() throws DocumentException {
        String path = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(path);
        Document read = new SAXReader().read(inputStream);
        Element rootElement = read.getRootElement();
        List<Element> datasource = rootElement.selectNodes("//property");

        for (Element element : datasource) {
            String name = element.attributeValue("name");
            String value = element.attributeValue("value");
            System.out.println(name);
            System.out.println(value);

        }

    }
}