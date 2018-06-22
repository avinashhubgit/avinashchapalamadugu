package com.h.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.h.deliver.Flipkart;

public class Spcls {
public static void main(String[] srgs)
{
	String prds[]={"soap","shampoos","kitchen item","bodyspray"};
	Resource res=null;
	BeanFactory factory=null;
	Object obj=null;
	Flipkart fk=null;
	System.out.println("111111111111");
	res=new FileSystemResource("src/com/h/xmls/appilicationContext.xml");
	System.out.println("2222222222");
	factory=new XmlBeanFactory(res);
	System.out.println("333333333333333");
	obj=factory.getBean("fkt");
	System.out.println("44444444");
	fk=(Flipkart)obj;
	System.out.println("55555555555555");
	fk.delivary(prds);
}
}
