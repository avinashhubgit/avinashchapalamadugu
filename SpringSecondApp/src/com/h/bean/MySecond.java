package com.h.bean;

import java.util.Scanner;

public class MySecond {
private Scanner scr;
private System in;
public MySecond(System in)
{
	this.in=in;
}
public void setScr(Scanner scr)
{
this.scr=scr;	
}
public void use()
{
int value=0;
System.out.println("your amount is 100 enter your amount ;;");
value=Integer.parseInt(scr.nextLine());
System.out.println(value);
if(value<=100)
{
	System.out.println("you prduct is delivered in 3 days by dtdc coreor");
	}
}
}
