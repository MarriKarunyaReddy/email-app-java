package emailapp;

import java.util.Scanner;

public class email extends EmailList{
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxcapacity=500;
	private String alternateemail;
	private int defaultPasswordLength;
	private String companydom ="xyzcompany.com";
	public email(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.defaultPasswordLength =12;
		System.out.println("EMAIL CREATED: for " + this.firstname + this.lastname);
		this.department = SetDepartment();
		System.out.println("Department: "+this.department);
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companydom;
	    System.out.println("Your email:"+email);
		this.password=randompass(defaultPasswordLength);
	    System.out.println("YourPasssword is:"+this.password);
	    mailbox box = new mailbox();
       box.inputmail(firstname, lastname, password, department);
	}
	
	private String SetDepartment(){
		System.out.println("Enter the department\n 1>for sales\n 2> for development\n 3>For Accounting\n 4>For Admin\n \n Department Code:");
	    Scanner read = new Scanner(System.in);
	    int departmentchoice = read.nextInt();
	    if(departmentchoice==1) {return "sales";}
	    if(departmentchoice==2) {return "Development";}
	    if(departmentchoice==3) {return "accounting";}
	    if(departmentchoice==4) {return "admin";}
	    else {return "";}     
	                                
	}
	private String randompass(int length) {
		String setpass = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=`!@#$%^&*()_+";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random()*setpass.length());
			password[i]=setpass.charAt(rand);
		}
		return new String(password);
		
	}
}
