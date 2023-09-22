package com.oops.MethodOverLoading;

public class demo_MOL {
	 // First addition function
    public static int add(int a, int b)
    {
        return a + b;
    }
 
    // Second addition function
    public static double add(
        double a, double b)
    {
        return a + b;
    }
	public static void main(String[] args) {
		 System.out.println(add(2, 3));
		 System.out.println(add(2.0, 3.0));
	}

}
