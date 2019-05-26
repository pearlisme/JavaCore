package com.pearl.java.common;

/*public class firstdemo {
	static public void main(String... args)
	{
		int num=100;
		num=num*2;
		System.out.println("The value is "+ num);
	}

}*/
public abstract class Firstdemo
{
	public abstract void run();
	public  void run1(){
		System.out.println("inside firstdemo");
		int a=10, b =10,c;
		c=a+b;
		System.out.println("the value is"+ c);
			
	}
}