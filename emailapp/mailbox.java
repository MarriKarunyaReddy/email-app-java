package emailapp;
import java.util.ArrayList;
import java.util.List;
public class mailbox extends EmailList {
	int serialCounter = 1;
    List<EmailList> employees = new ArrayList<>();
    List<EmailList> employeepvt = new ArrayList<>();

    int inputmail(String firstName, String lastName, String password, String department) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.password = password;
        this.department = department;
        this.emailserial = serialCounter;
        employees.add(this);
        System.out.println("New Employee Added: " + firstName + " " + lastName);
        System.out.println("Serial Number: " + serialCounter);
        serialCounter++;
        return this.emailserial;
    }
}


