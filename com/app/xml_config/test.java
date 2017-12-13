package com.app.xml_config;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String args[])
	{
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/xml_config/config.xml");
			Object ob=ctx.getBean("model");
				model_spring_bean mod=(model_spring_bean)ob;
					System.out.println("\t\t"+mod);
						ctx.registerShutdownHook();
	}

}
