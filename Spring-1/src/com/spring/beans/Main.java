package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.launcher.resources.launcher;

public class Main {
   public static void main (String[] args) {
/*	   //创建HelloWorld 的一个对象
	   HelloWorld helloWorld = new HelloWorld();
	   //为name 属性赋值
	   helloWorld.setName("lalala");*/   
	   //1.创建Spring 的IOC容器对象
	   //ApplicationContext 代表Spring的IOC容器，是个接口
	   /* ClassPathXmlApplicationContext表示配置文件在类路径下，是AC接口的实现类，该实现类从类路径下来加载配置文件，
	    传入的是xml文件，创建容器时，调用helloworld里面的构造器，
	    对在配置文件中配置的bean进行初始化，同时调用set方法对其初始化值*/
	   ApplicationContext ctx=
			   new ClassPathXmlApplicationContext("applicationContext.xml");
       //2.从IOC容器中获取Bean 实例
	   /*getBean后面的去xml文件里找id*/
	   HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld2");
	   System.out.println("获取到Bean 实例"+helloWorld);
	   //3.调用hello方法
	   helloWorld.hello();
	   
	
}
}
