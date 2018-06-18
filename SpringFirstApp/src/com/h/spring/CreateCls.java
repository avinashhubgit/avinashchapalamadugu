package com.h.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.h.myclass.Myapp;

public class CreateCls {
public static void main(String[] args)
{
	System.out.println("........");
Resource res=null;
Object obj=null;
BeanFactory factory=null;
Myapp cc=null;
//load the xml document
System.out.println("##########");
res= new FileSystemResource("com/h/cngf/appilicationContext.xml");
//create ioc container
System.out.println("**********");
factory=new XmlBeanFactory(res);
System.out.println("7777777");
obj=factory.getBean("My",Myapp.class);
cc=(Myapp)obj;
cc.wish("raju");
}
}
