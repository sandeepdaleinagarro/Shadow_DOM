package com.javapractice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 567789;
		
		rev(num);
		
		
		/*
		 * while(num > 0) { int digit = num%10; System.out.print(digit); num = num / 10;
		 * }
		 */
	}
	
	public static void rev(int num) {
		if(num < 10) {
			System.out.print(num);
			return;
		}else {
			System.out.print(num%10);
			rev(num/10);
		}
	}

}
