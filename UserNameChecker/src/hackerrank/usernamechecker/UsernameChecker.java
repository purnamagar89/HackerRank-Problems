package hackerrank.usernamechecker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter username to be tested : ");
		String username = scan.nextLine();
		
		scan.close();
		System.out.println("Entered username is :"+validateUsername(username));
	}

	private static String validateUsername(String username) {
		//username contain alphanumeric, _.
		//username must start from alphabet
		//must be 8 -30 character in length
		String status = "invalid";
		
		String usernamePattern = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
		Pattern pattern = Pattern.compile(usernamePattern);
		Matcher m = pattern.matcher(username);
		if(m.matches()){
			status = "Valid";
		}
		
		return status;
		

	}

}
