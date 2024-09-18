package com.javapractice;

public class SimilarWordCheck {

	public static void main(String[] args) {

		String s1 = "ADD";
		String s2 = "DAD";
		char temp;
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		for (int i = 0; i < charArray1.length; i++) {
			for (int j = i+1; j <= charArray1.length - 1; j++) {
				if(charArray1[i] > charArray1[j]) {
					temp = charArray1[i];
					charArray1[i] = charArray1[j];
					charArray1[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < charArray2.length; i++) {
			for (int j = i+1; j <= charArray2.length -1; j++) {
				if(charArray2[i] > charArray2[j]) {
					temp = charArray2[i];
					charArray2[i] = charArray2[j];
					charArray2[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < charArray1.length; i++) {
			sb1.append(Character.toString(charArray1[i]));
			
		}
		
		for (int i = 0; i < charArray2.length; i++) {
			sb2.append(Character.toString(charArray2[i]));
		}
		
		System.out.println(sb1 + " " + sb2);
		
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println("Both the strings are similar");
		}
	}
}
