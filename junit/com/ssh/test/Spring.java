package com.ssh.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
	private ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	// ���ڲ��Ե���Spring�Ƿ�ɹ�
	@Test
	public void testBean() throws Exception {

		// Bean������ ����ĸҪСд
		StrutsAction StrutsAction = (StrutsAction) ac.getBean("strutsAction");
		System.out.println(StrutsAction);
	}
}
