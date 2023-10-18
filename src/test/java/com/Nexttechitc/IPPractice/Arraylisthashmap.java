package com.Nexttechitc.IPPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arraylisthashmap {

	
	public static void main(String[] args) {
		
	
		//store array --> Datatype[]variable name={D1,D2,D3};
		
		String[]flower= {"rose","lily","jasmine"};
		
		int[]num= {1,2,3,4,5};
		
		//access array--> system.out.println(variable name[index number]);
		
		System.out.println(flower[0]);
		
		//Change in array--> variable name[index]="new name"
		
		flower[1]="zinnia";
		
		System.out.println(flower[1]);
		
		System.out.println(flower.length);
 
		System.out.println(num.length);
		
		
		
		//ArrayList 
		
		ArrayList<String>fruit= new ArrayList<String>();
		
		// add to arraylist--> variable name.add
		
		fruit.add("mango");
		fruit.add("apple");
		fruit.add("banana");
		
		System.out.println(fruit);
		
		//  access arraylist
		
		fruit.get(2);
		
		
		
		
		
		
		
	}

}
