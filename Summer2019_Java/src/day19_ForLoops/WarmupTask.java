package day19_ForLoops;
import java.util.Scanner;

public class WarmupTask {
	public static void main(String[] args) {
		/*
		 *Given:  username: cybertek.batch12@gmail.com
            password: Javengers
    write a program for the login functionality of the gmail account. (user input is required)
        - username can be entered either in upper or lower case
        - password MUST be entered as it is
        - if the username does not end with "@gmail.com":
                    print "it's not a valid email"
        - if username ends with gmail but username or password did not match:
                    print "Invalid username or password"
        - if the username and passwords are correct:
                    print "logged in successfully"
		 */
		

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter username:");
	String user=scan.nextLine().toLowerCase();
	System.out.println("Enter password:");
	String pass=scan.nextLine();
	String username="cybertek.batch12@gmail.com";
	String password="Javengers";
	if(user.endsWith("@gmail.com")) {
		if(user.equalsIgnoreCase(username)&& pass.equals(password)) {
			System.out.println("Logged in Successfully");
		}else {
			System.out.println("Invalid user name or password");
		}
	} else {
		System.out.println("It is not a valid email address");
	}
	

}
}
