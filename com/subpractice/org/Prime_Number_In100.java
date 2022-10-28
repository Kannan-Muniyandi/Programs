package com.subpractice.org;

public class Prime_Number_In100 {
	
	
	
	 public static void main(String[] args) {
		 int n=100;
		 int count=0;
		
		 for (int j = 2; j <=n; j++) {
			 boolean flag = true;
			 for (int i = 2; i < j; i++) {
					
					
					
					if(j%i==0) {
						
						flag=false;
						break;
					}
				}
				
				if(flag==true) {
					
					System.out.println(j+ " is a Prime Number");
					count++;
				}else {
					System.out.println(j+ " is a Non-Prime Number");
				}
				}
		        System.out.println("Total no of Prime Number : " +count);
           }
	   }
