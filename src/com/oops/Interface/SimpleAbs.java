package com.oops.Interface;

public abstract class SimpleAbs implements Laptop{
	public void cut()
	{
		System.out.println("This is Lenovo cut code");
	}
	
	public void copy()
	{
		System.out.println("This is Lenovo copy code");
	}
	
	public abstract void paste();
	public abstract void keyboard();
}
