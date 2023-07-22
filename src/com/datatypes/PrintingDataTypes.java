package com.datatypes;

public class PrintingDataTypes {
	public static void main(String[] args) {
		int i= 100;
		byte b= 5;
		short s =45;
		float f = 4.25614f;
		double d = 5.234128;
		long l =1251245;
		char c = 'k';
		
		System.out.println("integer"+"\t"+i);
		System.out.println("byte"+"\t"+b);
		System.out.println("short"+"\t"+s);
		System.out.println("float"+"\t"+f);
		System.out.println("double"+"\t"+d);
		System.out.println("long"+"\t"+l);
		System.out.println("char"+"\t"+c);
		System.err.println("Integer "+"\t"+Integer.SIZE+"\t"+Integer.MIN_VALUE+"/t"+Integer.MAX_VALUE);
		System.err.println("Byte "+"\t"+Byte.SIZE+"\t"+Byte.MIN_VALUE+"/t"+Byte.MAX_VALUE);
		System.err.println("Short "+"\t"+Short.SIZE+"\t"+Short.MIN_VALUE+"/t"+Short.MAX_VALUE);
		System.err.println("Float "+"\t"+Float.SIZE+"\t"+Float.MIN_VALUE+"/t"+Float.MAX_VALUE);
		System.err.println("Double "+"\t"+Double.SIZE+"\t"+Double.MIN_VALUE+"/t"+Double.MAX_VALUE);
		System.err.println("Long "+"\t"+Long.SIZE+"\t"+Long.MIN_VALUE+"/t"+Long.MAX_VALUE);
		System.err.println("Char "+"\t"+Character.SIZE);
		
															
		
	}
}
