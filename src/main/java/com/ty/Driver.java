package com.ty;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("conf.xml");
		Student student=(Student)context.getBean("student");
		
		for(Entry<Integer, String> map:student.getSubject().entrySet())
		{
			System.out.println(map);
		}
	}

}
