package com.collections.lists;

import java.util.ArrayList;
import java.util.Collections;

public class Adding_Elements {

	public static void main(String[] args) {
	ArrayList <String> values = new  ArrayList<String>();
	 values.add("Ford");
	 values.add("Benz");
	 values.add("Toyota");
	 values.add("Suzuki");
	 values.add("MG");
	 System.out.println(values);
	 
	 // Access an item
	 System.out.println(values.get(0));
	 
	 // Modify an item
	 System.out.println(values.set(1, "Mercedis-Benz"));
	 
	 // Remove an item
	 System.out.println(values.remove(3));
	 
	 //Sorting
	 
	 Collections.sort(values);
	 
	 for (String i : values) {
		System.out.println(i);
	}
	 
	 
	 System.out.println(values.size());
	}

}
