package com.tuwien.sha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
     	
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/tuwien/sha/beans/beans.xml");
		
		Student st1 =  (Student) context1.getBean("Student");
		Student st2 =  (Student) context1.getBean("Student");
	
		st1.speak();
		
		Course co1 = (Course) context1.getBean ("Course");
		//co1.teach();
		System.out.println(co1);
		 
		 //st1.Student(3, "padashi ");   // this will not call a constructor because the constructor ain't has a void. its just a method which has the same name and parameters rather than the constructor! 
		
		st2.setName("hanna");
		System.out.println(st1);
	 	System.out.println(st2);
	 	
		//st1.Student(2, "zand");
		//st1.setId(2);
		//System.out.println(st1.getId()); 
		 // st1.setId( 5);
		 //System.out.println(st1.getId()); 
		/* 
		 its for checking getter and setter
		 */
		
		//System.out.println(st1); 

		
		
	(( ClassPathXmlApplicationContext)context1).close();
	}

}
