package com.lvlifeng;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Lv Lifeng
 * @date 2022-04-27 20:01
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("demo started successful!");
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		ClassPathResource resource = new ClassPathResource("spring-config.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		BeanTest beanTest = (BeanTest) factory.getBean("myTestBean");
		System.out.println(beanTest.getName());
	}
}
