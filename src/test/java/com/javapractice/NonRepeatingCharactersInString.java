package com.javapractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharactersInString {

	public static void main(String[] args) {

		String word = "bxvchshyruwikjndnbfhfhdjsjka";
		int maxLength = 0;

		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		char[] charArray = word.toCharArray();
		String nonRepeatingWord = null;

		for (int i = 0; i < charArray.length; i++) {
			if(!charMap.containsKey(charArray[i])) {
				charMap.put(charArray[i], i);
			}else {
				i = charMap.get(charArray[i]);
				charMap.clear();
			}
			if(charMap.size() > maxLength) {
				maxLength = charMap.size();
				nonRepeatingWord = charMap.keySet().toString();
			}
		}
		System.out.println("The biggest non repeating word is : " + nonRepeatingWord);
	}
}
