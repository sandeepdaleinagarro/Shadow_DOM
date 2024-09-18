package com.javapractice;

public class CapitalizedString {

	public static void main(String[] args) {
		String str = "asmaka manjari maikina";
		capitalizedString(str);
		capitalizedString("p");
	}

	public static void capitalizedString(String str) {

		if(str == null) {
			return;
		}else if(str.length() == 1) {
			System.out.println(str.toUpperCase());
		}else {
			String[] wordsArray = str.split("\\s");
			String result = "";

			for (String word : wordsArray) {
				String firstLetter = word.substring(0, 1).toUpperCase();
				String restLetter = word.substring(1, word.length());
				result = result+firstLetter+restLetter+" ";
			}

			System.out.println(result.trim());
		}
	}

}
