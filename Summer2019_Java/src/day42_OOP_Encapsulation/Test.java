package day42_OOP_Encapsulation;
// import static day44_AccessModifiers.TestData.age;
public class Test {
	public static void main(String[] args) {
		TestData obj= new TestData();
		//System.out.println(obj.Name); the data was private
		System.out.println( obj.getName() );
		String str= obj.getName();
		System.out.println(str);
		int id=obj.getID();
		System.out.println(id);
		
		//modify
//		obj.Name="Nurzat"; will not allow me to modify without a setter
		
		obj.setName("Nurzat");
		System.out.println(obj.getName());
		
		obj.setID(400);
		System.out.println(obj.getID());
		//System.out.println(age); even importing the package and class will not let it compile because it has default access modifier. 
		
		
	} 

}
