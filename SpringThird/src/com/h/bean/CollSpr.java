package com.h.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class CollSpr {
private ArrayList arrl;
public CollSpr(ArrayList arrll)
{
this.arrl=arrl;	
}
public void use()
{
arrl.add(10);
arrl.add(50);
arrl.add(160);
arrl.add(20);
arrl.add(9);
Iterator itr=arrl.iterator();
while(itr.hasNext())
{
Object obj=itr.next();
int a=(Integer)obj;
System.out.println(a);
}
}
}
