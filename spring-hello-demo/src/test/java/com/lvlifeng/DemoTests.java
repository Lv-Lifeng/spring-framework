package com.lvlifeng;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Lv Lifeng
 * @date 2022-04-27 18:26
 */
public class DemoTests {

	@Test
	public void MyTestBeanTest() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		BeanTest beanTest = (BeanTest) bf.getBean("myTestBean");
		System.out.println(beanTest.getName());
	}
}
