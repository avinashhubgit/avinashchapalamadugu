package com.h.soc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.h.bean.CollSpr;

public class SprObjCrt {
public static void main(String[] args)
{
Resource res=null;
BeanFactory factory=null;
Object obj=null;
CollSpr spr=null;
res=new FileSystemResource("src/com/h/cnfg/AppilicationContext.xml");
factory=new XmlBeanFactory(res);
obj=factory.getBean("spr");
spr=(CollSpr)obj;
spr.use();
}
}
