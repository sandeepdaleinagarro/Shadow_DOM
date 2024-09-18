package com.javapractice;

public class Child extends Parent{
	public static void hello() {
	    System.out.println("Child class says hello!");
	  }

	  // Overriding non-static method of base class
	  public void bye() {
	    System.out.println("Child class says bye!");
	  }
	  
	  
	  public static void main(String[] args) {
		Parent child = new Child();
		child.hello();
		child.bye();
	}
}
