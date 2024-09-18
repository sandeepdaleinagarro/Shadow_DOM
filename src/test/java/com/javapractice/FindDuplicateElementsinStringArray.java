package com.javapractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementsinStringArray {

	public static void main(String[] args) {
		
		String[] wordArray = {"Amazon", "Flip","Lowes","SnapDeal","Amazon", "Lowes", "Ajio","Studio", "Amazon","Lowes","SnapDeal","BigBazar"};
		Map<String, Integer> wordmap = new HashMap<String, Integer>();
		
		for (String word : wordArray) {
			Integer count = wordmap.get(word);
			if(count == null) {
				wordmap.put(word, 1);
			}else {
				wordmap.put(word, ++count);
			}
		}
		Set<Entry<String, Integer>> entrySet = wordmap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		
		System.out.println("________");
		Set<String> wordSet = new HashSet<String>();
		
		for (String word : wordArray) {
			if(wordSet.add(word) == false) {
				System.out.println(word);
			}
		}
	}

}
