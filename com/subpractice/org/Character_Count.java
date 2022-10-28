package com.subpractice.org;

public class Character_Count {

	public static void main(String[] args) {
		
		String name = "KANNAN";
		int a =0;
		char search = 'A';
		//System.out.println(name.length());
		for (int i = 0; i < name.length(); i++) {
			
			if(search==name.charAt(i)) {
				a++;
			}
		}
		System.out.println("Count of "+ search +" is "+ a );
		
		
	}
	
	
	
}
