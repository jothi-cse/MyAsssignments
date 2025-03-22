package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "stops";
		String b = "potss";
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if (Arrays.equals(c, d)) {
            System.out.println("The given strings are Anagrams");
        } else {
            System.out.println("The given strings are not Anagrams");
        }
    }
}