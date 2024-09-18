package com.javapractice;

public class Demo {
	
	public int add(int a, float b)
	  {
	    int sum = (int) (a+b);
	    return sum;
	  }
	  //two float parameters
	  public float add(float a, int b)
	  {
	    float sum = (float) a+b;
	    return sum;
	  }


	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.add(5, 10.0f));
		System.out.println(demo.add(4.3f, 5));
	}

}
