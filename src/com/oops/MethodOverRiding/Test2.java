package com.oops.MethodOverRiding;

public class Test2 extends Test{
	 public void method()
	    {
	        System.out.println("Method 2");
	    }
	 
	public static void main(String[] args) {
		
		    // Driver code
		Test test = new Test2();
		 
        test.method();
		        
	}

}
