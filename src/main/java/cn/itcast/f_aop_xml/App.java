package cn.itcast.f_aop_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/f_aop_xml/bean.xml");
	
	// 目标对象有实现接口，spring会自动选择“JDK代理”
	@Test
	public void testApp(){
		IUserDao userDao = (IUserDao) ac.getBean("userDao");
		
		System.out.println(userDao.getClass());
		
		userDao.save();
	}
}
