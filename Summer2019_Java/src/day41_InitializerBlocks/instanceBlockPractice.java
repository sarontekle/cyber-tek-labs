package day41_InitializerBlocks;

public class instanceBlockPractice {
	
	public String name="Shirin";
	public instanceBlockPractice(){
		this(200);
		name="Dinara";
	}
	{
		name="Mihray";
	}
	{
	name="Hatice";	
	}
	public instanceBlockPractice(int a) {
		name="Muhtar";
	}
	
	public static void main(String[] args) {
		instanceBlockPractice obj= new instanceBlockPractice();
		// obj.name="Aijamal";
		System.out.println(obj.name);
		instanceBlockPractice obj1= new instanceBlockPractice();
		System.out.println(obj1.name);
	}
	
	
	
	
	

}
