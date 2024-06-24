package com.cyands.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestStringManipulator {
	
	private StringManipulator stringManipulator;
	
	@BeforeEach
	public void init() {
		stringManipulator = new StringManipulator();
	}

	@DisplayName("Test for Marker")
    @Test
    public void testMarker() {
		
        assertEquals(4, stringManipulator.findMarker("abcde"));
        assertEquals(5, stringManipulator.findMarker("aabcde"));
        assertEquals(6, stringManipulator.findMarker("aaabcde"));
        assertEquals(6, stringManipulator.findMarker("aaacdef"));
        assertEquals(7, stringManipulator.findMarker("aabbcdef"));
        assertEquals(-1, stringManipulator.findMarker("aaaaa"));
        assertEquals(5, stringManipulator.findMarker("bvwbjplbgvbhsrlpgdmjqwftvncz"));
        assertEquals(6, stringManipulator.findMarker("nppdvjthqldpwncqszvftbrmjlhg"));
        assertEquals(10, stringManipulator.findMarker("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"));
        assertEquals(11, stringManipulator.findMarker("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"));
    }
	
	@DisplayName("Test for Palindrome")
    @Test
    public void testPalindrome() {
        assertEquals(true, stringManipulator.isPalindrome("aa"));
        assertEquals(false, stringManipulator.isPalindrome("ab"));
        assertEquals(true, stringManipulator.isPalindrome("aba"));
        assertEquals(true, stringManipulator.isPalindrome("cpc"));
        assertEquals(true, stringManipulator.isPalindrome("abba"));
        assertEquals(false, stringManipulator.isPalindrome("abca"));
        assertEquals(true, stringManipulator.isPalindrome("abcba"));
        assertEquals(false, stringManipulator.isPalindrome("abcdba"));
        assertEquals(true, stringManipulator.isPalindrome("racecar"));
        assertEquals(true, stringManipulator.isPalindrome("radar"));
        assertEquals(false, stringManipulator.isPalindrome("fail"));
    }

	@DisplayName("Test for Anagram")
    @Test
    public void testAnagram() {
        assertEquals(true, stringManipulator.isAnagram("a","a"));
        assertEquals(false, stringManipulator.isAnagram("a","b"));
        assertEquals(true, stringManipulator.isAnagram("aa","aa"));
        assertEquals(true, stringManipulator.isAnagram("ab","ab"));
        assertEquals(true, stringManipulator.isAnagram("ab","ba"));
        assertEquals(false, stringManipulator.isAnagram("abc","bda"));
        assertEquals(true, stringManipulator.isAnagram("Dormitory", "Dirty room"));
        assertEquals(false, stringManipulator.isAnagram("design patterns", "trending passion"));
        assertEquals(false, stringManipulator.isAnagram("continuous integration", "i am not even trying"));
        assertEquals(false, stringManipulator.isAnagram("design patterns", "trending passions")); 
        assertEquals(false, stringManipulator.isAnagram("software architecture", "wise tracer of hi tech wares"));
        assertEquals(true, stringManipulator.isAnagram("software","waresoft"));
    }
}
