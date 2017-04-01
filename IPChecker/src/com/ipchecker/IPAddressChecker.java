package com.ipchecker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressChecker {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Ip address ");
		String ipAddress = scan.nextLine();
		scan.close();
		System.out.println(validateIpAddress(ipAddress));
		System.out.println("this change made from macproo");
	}

	private static boolean validateIpAddress(String ipAddress) {
		String ipAddressPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

		Pattern pattern = Pattern.compile(ipAddressPattern);
		Matcher matcher = pattern.matcher(ipAddress);
		return matcher.matches();

	}

}
