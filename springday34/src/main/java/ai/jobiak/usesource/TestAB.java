package ai.jobiak.usesource;
import org.springframework.core.io.FileSystemResource;

import ai.jobiak.ifaces.Bdigital;
import ai.jobiak.source.A;
import org.springframework.beans.factory.BeanFactory; 
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class TestAB {
public static void main(String[] args) {

		

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
	
		//B b= new B();
				//b.doPublishing(); // throws NullPointerException
				//before spring
				//after spring
				//B b=(B)factory.getBean("b");
				/*
				 * b.doPublishing(); if(factory.containsBean("aObj")) { A a=(A)
				 * factory.getBean("aObj"); a.print(); }
				 */
		
		
		
		
		Bdigital bdigital=(Bdigital)factory.getBean("bdigital");

		bdigital.publish();
}
	
}

