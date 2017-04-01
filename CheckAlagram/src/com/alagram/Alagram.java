package com.alagram;

import java.util.Arrays;
import java.util.Scanner;

public class Alagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String1 ");
		String s1 = scan.nextLine();

		System.out.println("Enter the String2 ");
		String s2 = scan.nextLine();
		scan.close();
		

		System.out.println(checkAlagram(s1, s2));

	}

	private static boolean checkAlagram(String s1, String s2) {
		boolean isAlagram = false;
		String s1Sub = s1.replaceAll("\\s", "");
		String s2Sub = s2.replaceAll("\\s", "");
		if (s1Sub.length() != s2Sub.length()) {
			isAlagram = false;
		} else {
			char[] sa1 = s1Sub.toLowerCase().toCharArray();
			char[] sa2 = s2Sub.toLowerCase().toCharArray();

			Arrays.sort(sa1);
			Arrays.sort(sa2);

			isAlagram = Arrays.equals(sa1, sa2);

		}

		return isAlagram;
	}

}
