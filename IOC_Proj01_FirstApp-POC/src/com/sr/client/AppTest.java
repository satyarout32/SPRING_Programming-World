package com.sr.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sr.beans.WishMessageGenerator;

public class AppTest {

	public static void main(String[] args) {
		System.out.println("AppTest.main()");
		
		Resource res = null;
		BeanFactory factory = null;

		System.out.println("Execution Start....");
		
		//Create Resource class obj and just hold the file ame with path
		res = new FileSystemResource("src/com/sr/cfgs/applicationContext.xml");
		
		//Create BeanFactory Obj to access Container by passing resource
		factory=new XmlBeanFactory(res);
		
		
		WishMessageGenerator generator=(WishMessageGenerator)factory.getBean("wmg");
		System.out.println("Result..:"+generator.generateMessage("Satya"));
		 
		System.out.println("Execution End....");
	}

}
