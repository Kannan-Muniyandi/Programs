package com.subpractice.org;

public class String_Reverse_1 {
public static void main(String[] args) {
	String str = "Kannan is good boy";
	String[] split = str.split(" ",4);

	int j = split.length;

	for( int i=j-1;i>=0;i--) {
		
		System.out.print(split[i]+" ");
	}
}
}
