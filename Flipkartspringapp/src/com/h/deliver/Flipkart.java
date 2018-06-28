package com.h.deliver;

import java.util.Random;

import com.h.firstflight.Firstflight;
import com.h.inter.Delivery;

public class Flipkart {
private Delivery delivar;
//private Firstflight first;
public void setDelivar(Delivery delivar)
{
this.delivar=delivar;	
}
//String prds[]={"soap","shampoos","kitchen item","bodyspray"};
	public void delivary(String[] prdt)
{
	//prdt=prds;
	int qty=prdt.length;
	int bill=qty*10;
	Random r=new Random();
	int id=r.nextInt(99858956);
	
	System.out.print("your total bill is"+bill+"your items is"+prdt);
	delivar.delivary(id );
}
}
