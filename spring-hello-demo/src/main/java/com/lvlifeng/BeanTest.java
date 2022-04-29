package com.lvlifeng;

/**
 * @author Lv Lifeng
 * @date 2022-04-27 18:25
 */
public class BeanTest {
	private String name = "Hello";

	public BeanTest(String name) {
		this.name = name;
	}

	public BeanTest() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
