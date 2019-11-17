package day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials{
	private String userName;
	private String passWord;
	
	//constructor
	public credentials() {
		setuserName("123");
		setpassWord("admin");
	}
	
	
	//getter
	public String getuserName() {
		return userName;
	}
	public String getpassWord() {
		return passWord;
	}
	//setter
	public void setuserName(String userName) {
		this.userName= userName;
	}
	public void setpassWord(String passWord) {
		this.passWord=passWord;
	}
	// one getter for all
	public void getCredentials() {
		
		System.out.println("username: "+ getuserName() );
		System.out.println("password: "+ getpassWord() );
	}
	//one setter for all
	public void setCredentials(String userName, String passWord) {
		this.userName= userName;
		this.passWord=passWord;
	}
}

public class EncapsulationReview {
	public static void main(String[] args) {
	credentials Zylf=  new credentials();	
	    System.out.println(	Zylf.getuserName());
	    System.out.println(	Zylf.getpassWord());
	    
		credentials Nurzat= new credentials();
		Nurzat.setuserName("9876");
		Nurzat.setpassWord("cybertek");
		System.out.println(Nurzat.getuserName());
		System.out.println(Nurzat.getpassWord());
		
		credentials Seyfo= new credentials();
		Seyfo.setCredentials("seyfo@gmail.com", "CYBERTEK");
		Seyfo.getCredentials();
		
		
		ArrayList<credentials> credentialList= new ArrayList<>(Arrays.asList(Seyfo, Nurzat, Zylf));
		
		
	}
	

}
