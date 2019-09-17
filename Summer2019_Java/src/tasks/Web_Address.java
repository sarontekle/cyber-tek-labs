package tasks;
import java.util.Scanner;

public class Web_Address {
	public static void main(String[] args) {
		/*
		 Write a Java program that can check the URL

Valid extensions for URL are: com, net, edu, org, gov

- check that it starts with www.
- check if it contains the ending dot right before the extension
- assign String domain and 
String extension.
- print them
"Domain:" amazon
"Extension:" com 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Web Address:");
		String domain, extension;
		String website=scan.nextLine();
		extension=website.substring(website.lastIndexOf(".")+1);
		if(website.startsWith("www")&& website.contains(website.substring(website.lastIndexOf("."), website.lastIndexOf(".")+1))) {
			switch(extension){
			case "com": case "net": case "edu": 
			case "org": case "gov":
				System.out.println("its a valid URL");
				break;
			default:
				System.out.println("Invalid URL");
				break;
			} 
		}else {
			System.out.println("Invalid Extension");
		}
		domain= website.substring(4,website.lastIndexOf("."));
		
		System.out.println("Domain: "+domain);
		System.out.println("Extension: "+extension);
		
	}

}
