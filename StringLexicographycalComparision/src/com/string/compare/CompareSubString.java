package com.string.compare;

import java.util.Scanner;

public class CompareSubString {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = scan.next();
		System.out.println("Enter Length of sub string ");
		int k = scan.nextInt();
		scan.close();
		compareSubString(k,s);
				
	}
	
	public static void compareSubString(int k, String s){
		int initialIndex = 0;
		String subString;
		String smallest = s;
		String largest = "";
		while(k<=s.length()){
			subString = s.substring(initialIndex, k);
			if(subString.compareTo(largest)>=0){
				largest = subString;
				
			}else if(smallest.compareTo(subString)>=0){
				smallest = subString;
			}
			
			k++;
			initialIndex++;
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
