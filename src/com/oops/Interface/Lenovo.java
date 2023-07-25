package com.oops.Interface;

public  class Lenovo extends SimpleAbs{
	@Override
	public void paste() {
	System.out.println("This is paste code");
	}
		@Override
		public void keyboard() {
		System.out.println("This is keyboard code");
		
	}

	

//	public void copy() {
//		System.out.println("Lenovo updated code");
//	}

	public static void main(String[] args) {
		Lenovo l = new Lenovo();
		l.copy();
	}



}
