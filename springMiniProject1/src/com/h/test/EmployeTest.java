package com.h.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.h.controller.EmployeControl;
import com.h.vo.EmployeVO;

public class EmployeTest {
public static void main(String[] args)
{
	Scanner scanner=null;
BeanFactory factory=null;
Resource res=null;
EmployeVO vo=null;
String name=null;
String num=null;
String sal=null;
String job=null;
//loading the file
res=new ClassPathResource("com/h/cfgs/appilicationContext.xml");
//creating bean factory container
factory=new XmlBeanFactory(res);
//create object for dependent class
EmployeControl control=factory.getBean("ser",EmployeControl.class);
//taking values from the end user
scanner=new Scanner(System.in);
System.out.println("Enter employe name");
name=scanner.nextLine();
System.out.println("Enter employe number");
num=scanner.nextLine();
System.out.println("Enter employe job");
job=scanner.nextLine();
System.out.println("Enter employe sal");
sal=scanner.nextLine();
//create vo obj
vo=new EmployeVO();
//set values to the vo obj
vo.setEname(name);
vo.setEno(num);
vo.setJob(job);
vo.setSalary(sal);
try{
String result=control.convert(vo);
}
catch(Exception e)
{
System.out.println("internal problem");
e.printStackTrace();
}
}
}
