package com.javapractice;

public class InvertedPyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 6-1-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
