package com.javapractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateCharactersOfaString {

	public static void main(String[] args) {
		String word= "dgffghghgjtyyuiopsccfg";
		findDuplicates(word);
		findDuplicates("4545sdfnmopoasewxvbgghcffxxx");
		findDuplicates("334900192777173774348458599");

	}

	public static void findDuplicates(String word) {
		char[] charArray = word.toCharArray();
		Map<Character, Integer> wordMap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			if(wordMap.containsKey(charArray[i])) {
				wordMap.put(charArray[i], wordMap.get(charArray[i]) + 1);
			}else {
				wordMap.put(charArray[i], 1);
			}
		}

		System.out.println(wordMap);

		Set<Entry<Character, Integer>> entrySet = wordMap.entrySet();

		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		
		System.out.println("___________");
	}
}
