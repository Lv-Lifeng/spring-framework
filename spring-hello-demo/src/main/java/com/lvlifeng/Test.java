package com.lvlifeng;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Lv Lifeng
 * @date 2022-04-27 20:01
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("started");
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		BeanTest beanTest = (BeanTest) bf.getBean("myTestBean");
		System.out.println(beanTest.getName());
	}
}
