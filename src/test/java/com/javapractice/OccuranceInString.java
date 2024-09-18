package com.javapractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceInString {

	static final int MAX_CHAR = 256;  
	static void getOccuringChar(String str)  
	{  
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		
		for (char c : charArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c,1);
			}
		}
		
		System.out.println(charMap);
		
		Set<Character> keySet = charMap.keySet();
		
		int max = 0;
		char maxChar = 0;
		for (Character character : keySet) {
			if(charMap.get(character) > max) {
				max = charMap.get(character);
				maxChar = character;
			}
		}
		
		System.out.println("The max character is :" + maxChar + "The occurance is "+ max);
	}  

	public static void main(String[] args) {
		String str = "test jhuuu"; 
		getOccuringChar(str);  
	}

}
