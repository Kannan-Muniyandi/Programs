package com.subpractice.org;

public class Pattern_1 {
	public static void main(String[] args) {       // *
int i=1;                                           // ***
for(int row=1; row<=3; row++) {                    // *****
	for(int col = 1; col<=i; col++) {
		System.out.print("*");
	}
	i=i+2;
	System.out.println();
}
}
}