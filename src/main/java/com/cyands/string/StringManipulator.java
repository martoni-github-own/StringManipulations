package com.cyands.string;

import java.util.Arrays;

public class StringManipulator {
	
	public int findMarker(String sequence) {
		for(int i=4;i<sequence.length();i++) {
			if(isFromDifferentChars(sequence.substring(i-4,i))) {
				return i;
			}
		}
		return -1;
	}
	
	protected boolean isFromDifferentChars(String word) {
		String sortedWord=sortString(word);
		for(int i=0;i<3;i++) {
			if(sortedWord.charAt(i)==sortedWord.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPalindrome(final String word) {
		for(int i=0;i<word.length()/2;i++) {
			if(word.charAt(i)!=word.charAt(word.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isAnagram(final String text1, final String text2) {
		if(text1==null||text2==null) {
			return false;
		}
		if(text1.equals(text2)) {
			return true;
		}
		final String sortedText1=sortString(text1.replace(" ", ""));
		final String sortedText2=sortString(text2.replace(" ", ""));
		if(sortedText1.length()!=sortedText2.length()) {
			return false;
		}
		return sortedText1.equals(sortedText2);
	}
	
	protected String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}

