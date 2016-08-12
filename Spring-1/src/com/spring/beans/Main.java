package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.launcher.resources.launcher;

public class Main {
   public static void main (String[] args) {
/*	   //����HelloWorld ��һ������
	   HelloWorld helloWorld = new HelloWorld();
	   //Ϊname ���Ը�ֵ
	   helloWorld.setName("lalala");*/   
	   //1.����Spring ��IOC��������
	   //ApplicationContext ����Spring��IOC�������Ǹ��ӿ�
	   /* ClassPathXmlApplicationContext��ʾ�����ļ�����·���£���AC�ӿڵ�ʵ���࣬��ʵ�������·���������������ļ���
	    �������xml�ļ�����������ʱ������helloworld����Ĺ�������
	    ���������ļ������õ�bean���г�ʼ����ͬʱ����set���������ʼ��ֵ*/
	   ApplicationContext ctx=
			   new ClassPathXmlApplicationContext("applicationContext.xml");
       //2.��IOC�����л�ȡBean ʵ��
	   /*getBean�����ȥxml�ļ�����id*/
	   HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld2");
	   System.out.println("��ȡ��Bean ʵ��"+helloWorld);
	   //3.����hello����
	   helloWorld.hello();
	   
	
}
}
