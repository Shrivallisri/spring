package ai.jobiak.usesource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ai.jobiak.ifaces.Bdigital;



public class TestAppContext {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();
		Bdigital bdigital = (Bdigital) context.getBean("bdigital");
		bdigital.publish();
		System.out.println(bdigital.hashCode());
	
		//Singleton design pattern
		//by using scope="prototype we get the differt hashcode"
	}

}


