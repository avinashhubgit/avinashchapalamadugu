package com.h.spng;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.h.bean.MySecond;

public class SecondDemo {
public static void main(String[] args)
{
Resource res=null;
BeanFactory factory=null;
Object obj=null;
MySecond ms=null;
//load xml file
System.out.println("11111111111");
res=new FileSystemResource("src/com/h/cngf/appilicationContext.Xml");
System.out.println("222222222222222222222");
//create ioc container
factory=new XmlBeanFactory(res);
System.out.println("444444444");
obj=factory.getBean("sec");
System.out.println("3333333333333");
ms=(MySecond)obj;
ms.use();
}
}
