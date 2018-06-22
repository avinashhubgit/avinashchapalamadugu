package com.h.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class CollSpr {
private ArrayList arrayList;
public void setArrayList(ArrayList arrayList)
{
this.arrayList=arrayList;	
}
public void use()
{
arrayList.add(10);
arrayList.add(50);
arrayList.add(160);
arrayList.add(20);
arrayList.add(9);
Iterator itr=arrayList.iterator();
while(itr.hasNext())
{
Object obj=itr.next();
int a=(Integer)obj;
System.out.println(a);
}
}
}
