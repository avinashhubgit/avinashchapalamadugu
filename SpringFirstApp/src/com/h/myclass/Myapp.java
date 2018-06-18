package com.h.myclass;

import java.util.Date;

public class Myapp {
	private Date date;
	public void setDate(Date date)
	{
		this.date=date;
	}
@SuppressWarnings("deprecation")
public void wish(String user)
{
	if(date.getHours()<12)
	{
		System.out.println("gm"+user);
	}
	else if(date.getHours()<18)
	{
		System.out.println("ga"+user);
	}
	else if(date.getHours()<21)
	{
		System.out.println("ge"+user);
	}
	else
	{
		System.out.println("gn"+user);
	}
	}
}
