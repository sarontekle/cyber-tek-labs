package day42_OOP_Encapsulation;

public class TestData {

	/*
	 Encapsulation:hiding the instance variable( hiding the data)
	 -this is done by using private access-modifier, it restricts the visibility of the data.
	 - public getters and setters are used to access the private data so other classes can not directly get access.
	 Used for:
	 =>for protection of sensitive data
	 ==>private: the feature will only be visible within the class, which means codes outside the class can not access the feature.
	 getter: is an instance method that is used to read the private data. it returns that value of that data(read only).
	 Name
	 ID
	 */
	private String Name= "Bekir"; //data is not visible to any other class
	private int ID= 897;
	//getter: an instance method that returns the value of the private data.
	public String getName() {
		return Name;
	}
	public int getID() {
		return ID;
	}
	//setter: a method that will allow you to change the value of the private data.
	public void setName(String Name) {
	   this.Name=Name;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
}
