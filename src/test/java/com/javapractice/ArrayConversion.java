package com.javapractice;

public class ArrayConversion {

	public static void main(String[] args) {
		String[] arr = {"d","b","e","f"};

		String join = String.join("", arr);

		System.out.println(join);

		System.out.println(joinString(";", arr));
		
		String str = "pops own";
		String replace = str.replace(" " , "");
		
		System.out.println(replace);
		
		String str1 = "popsownculture/%s";
		
		String format = String.format(str1, "23");
		
		System.out.println(format);
	}

	public static String joinString(String separator, String... values) {
		StringBuilder sb = new StringBuilder();

		for (String word : values) {
			sb.append(word);
			sb.append(separator);
		}

		return sb.substring(0,sb.length()-1);
	}

}
