package P1ptcpjt;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailidValidation {
	 public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	   public static void main(String[] args) {
	       ArrayList<String> emails = new ArrayList<String>();
	       // valid email addresses
	       emails.add("teravidya@example.com");
	       emails.add("sujisurya@example.com");
	       emails.add("vidyaamu@example.me.org");
	       //invalid email addresses
	       emails.add("amu.example.com");
	       emails.add("a m u.. amu@example.com");
	       emails.add("anuammu@.example.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
}
}