package com.h.servlet;

import java.io.Serializable;

public class BoServlet implements Serializable {
private String name=null,qly=null,cllg=null,skills=null,loc=null,gender=null;
private int age=0,expry=0,sly=0;
public void setName(String name)
{
this.name=name;	
}
public void setGender(String gender)
{
this.gender=gender;	
}
public void setQualification(String qly)
{
this.qly=qly;	
}
public void setCollege(String cllg)
{
this.cllg=cllg;	
}
public void setSkills(String skills)
{
this.skills=skills;	
}
public void setLocation(String loc)
{
this.loc=loc;	
}
public void setAge(int age)
{
this.age=age;	
}
public void setExperience(int expry)
{
this.expry=expry;	
}public void setSalary(int sly)
{
this.sly=sly;	
}
public String getName()
{
return name;	
}
public String getQualification()
{
return qly;	
}
public String getCollege()
{
return cllg;	
}
public String getGender()
{
return gender;	
}
public String getSkills()
{
return skills;	
}
public String getLocation()
{
return loc;	
}
public int getAge()
{
return age;	
}
public int getExceperience()
{
return expry;	
}
public int getSalary()
{
return sly;	
}
}
