package day42_OOP_Encapsulation;

public class Cybertek{

	public static void main(String[] args) {
		
		EmployeeInfo emrah= new EmployeeInfo();
		emrah.setName("Emrah");
		System.out.println(emrah.getName());
		
		emrah.setSSN(123456789);
		System.out.println( emrah.getSSN());
		
		byte a=27;
		emrah.setAge(a);
		System.out.println( emrah.getAge());
		
		emrah.setSalary(120_000);
		System.out.println( emrah.getSalary());
		System.out.println("=======================================");
		
		EmployeeInfo rohan= new EmployeeInfo();
		
		rohan.setInfo("Rohan", 1233456789, (byte)(25), 95000);
		
		System.out.println(rohan.getName());
		System.out.println(rohan.getSSN());
		System.out.println(rohan.getAge());
		System.out.println(rohan.getSalary());
		
		
		
		
	}
	
	
}
