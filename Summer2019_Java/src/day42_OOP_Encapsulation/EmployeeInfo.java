package day42_OOP_Encapsulation;

public class EmployeeInfo {

	
	/*
	 Name
	 SSN
	 Age
	 Salary
	 */
	
	private String Name;
    private long SSN;
    private byte Age;
    private double Salary;
    
    //Name:
    public void setName(String Name) {
    	this.Name= Name;
    }
    public String getName() {
    	return Name;
    }
    
    //SSN
    public long getSSN() {
    	return SSN;
    }
    public void setSSN(long SSN) {
    	this.SSN= SSN;
    }
    
    //Age:
    public byte getAge() {
    	return Age;
    }
    public void setAge(byte Age) {
    	this.Age= Age;
    }
    
    //Salary:
    public double getSalary() {
    	return Salary;
    }
    public void setSalary(double Salary) {
    	this.Salary=Salary;
    }
    
    //setInfoMethod:
    public void setInfo(String Name,long SSN, byte Age, double Salary) {
    	this.Name=Name;
    	this.SSN=SSN;
    	this.Age=Age;
    	this.Salary=Salary;
    }
    
    
	
}
