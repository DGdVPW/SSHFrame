package com.ssh.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
	private ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	// 用于测试单个Spring是否成功
	@Test
	public void testBean() throws Exception {

		// Bean的名字 首字母要小写
		StrutsAction StrutsAction = (StrutsAction) ac.getBean("strutsAction");
		System.out.println(StrutsAction);
	}
}
