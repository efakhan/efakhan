package com.Nexttechitc.IPPractice;

public class Accessmodifier {
	
	
	public int number=12; //public access modifier
	
	int num1= 15; //default access modifier
	
	private String name = "efa"; //private access modifier
	
	public void name() {
	System.out.println("number");
	}
	void name1() {
		System.out.println("nun1");
	}
	
	private void name2() {
		System.out.println("name");
	}
	
	public static void main(String[]args) {
		Accessmodifier obj=new Accessmodifier();
		
		System.out.println(obj.name);
		
		System.out.println(obj.num1);
		
		
	}
	
	
		
		
	}
	
	
	
	
	
	
	


