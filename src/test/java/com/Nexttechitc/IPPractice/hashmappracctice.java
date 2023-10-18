package com.Nexttechitc.IPPractice;

import java.util.HashMap;

public class hashmappracctice {

	public static void main(String[] args) {
	
		//HashMap<datatype1,datatype2>variablename=new HashMap<Datatype1,Datatype2>();
		
		HashMap<String,Integer>ID= new HashMap<String, Integer>();
		
		ID.put("efa", 987);
		ID.put("arafat", 234);
		ID.put("lota", 456);
		ID.put("efa", 789);
		
		//Access
		
		ID.get("lota");
		System.out.println(ID.get("lota"));
		
		//size 
		
		ID.size();
		System.out.println(ID.size());
		
		//Access
		
		System.out.println(ID);
		
		for(int a:ID.values()) {
			System.out.println(a);
			
			
			
		}
		}
		

	}


