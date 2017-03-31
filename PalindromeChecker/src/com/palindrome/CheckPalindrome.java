package com.palindrome;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		CheckPalindrome cp = new CheckPalindrome();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string :");
		String s = scan.nextLine();
		scan.close();
		System.out.println("String is palindrome :"+cp.isPalindrome(s));
		

	}
	
	public String isPalindrome(String s){
		String sReverse = "";
		String isPalindrome = "No";
		for(int i = s.length()-1;i>=0;i--){
			sReverse = (String)sReverse+s.charAt(i);	
		}
		if(s.equalsIgnoreCase(sReverse)){
			isPalindrome = "Yes";
		}
		
		return isPalindrome;
	}

}
