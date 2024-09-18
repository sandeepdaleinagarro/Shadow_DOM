package com.javapractice;

public class TestInstance {
	
	static {
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside Instance block");
	}
	
	TestInstance(){
		System.out.println("Inside Object");
	}

	public static void main(String[] args) {
		System.out.println("in Main Method");
		new TestInstance();
	}

}
