package emailapp;
import java.util.Scanner;

public class emailapp {
	public static void main(String[]args) {
		System.out.println("Enter the number of Inputs");
		Scanner read = new Scanner(System.in);
		int i=0;
		System.out.println("Enter your First Name");
        String firstname = read.nextLine();
		System.out.println("Enter your Last Name");
        String lastname = read.nextLine();
		email eml = new email( firstname, lastname);
	    
	}
}
