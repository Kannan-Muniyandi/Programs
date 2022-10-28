package com.subpractice.org;

public class Reverse_String {
 public static void main (String[] args) {
	  String word = "ABCD";
	  String Word2 = "";
	  for (int i = word.length()-1; i>=0 ;i--) {
		char c = word.charAt(i);
		Word2 =Word2+c;
	}
	  System.out.println(Word2);
	  if (word.equals(Word2)) {
		System.out.println("This is a Palindrome");
	}else {
		System.out.println("This is not a palindrome");
	}
	 
	  
	
	 
 }
	
	
	
}
