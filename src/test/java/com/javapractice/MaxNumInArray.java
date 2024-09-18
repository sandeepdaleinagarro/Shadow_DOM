package com.javapractice;

public class MaxNumInArray {

	public static void main(String[] args) {
		
		int[] numArray = {5,6,2,9,-3,789,44590,45,78,349,90,344,2238940,23,45567,23,908,1000};
		int max = 0;
		int min = 0;
		int temp =0;
		
		for (int i = 0; i < numArray.length -1; i++) {
			if(numArray[i] >= max) {
				max = numArray[i];
			}
		}
		
		System.out.println("The maximum number is : " + max);
		
		for (int i = 0; i < numArray.length -1; i++) {
			if(numArray[i] < min) {
				min = numArray[i];
			}
		}
		
		System.out.println("The minimum number is : " + min);
		
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i+1; j <= numArray.length -1; j++) {
				if(numArray[i] > numArray[j]) {
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " " );
		}
		
		System.out.println("\n" + "The second largest number is : " + numArray[numArray.length - 2]);
		
	}
}
