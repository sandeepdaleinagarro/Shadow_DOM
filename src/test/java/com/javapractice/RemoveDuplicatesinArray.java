package com.javapractice;

public class RemoveDuplicatesinArray {

	public static void main(String[] args) {

		int[] numsARray = { 3, 4, 8, 0, 98, 3, 1, 4, 8, 7, 6, 0, 1, 6, 456, 34, 98, 56, 76, 3 };

		for (int i = 0; i < numsARray.length - 1; i++) {
			for (int j = i + 1; j < numsARray.length; j++) {
				int temp;
				if (numsARray[i] > numsARray[j]) {
					temp = numsARray[i];
					numsARray[i] = numsARray[j];
					numsARray[j] = temp;
				}
			}
		}

		for (int i = 0; i <= numsARray.length - 1; i++) {
			System.out.print(numsARray[i] + " ");
		}
		
		int[] temp = new int[numsARray.length];
		int j = 0;
		
		for (int i = 0; i < numsARray.length-1; i++) {
			if(numsARray[i] != numsARray[i+1]) {
				temp[j] = numsARray[i];
				j = j+1;
			}
		}
		
		temp[j++] = numsARray[numsARray.length-1];
		System.out.println("\n");
		
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i] + " ");
		}


	}

}
