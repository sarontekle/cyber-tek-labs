package day39_JavaReview;

public class CellPhoneObjects {
	
	public static void main(String[] args) {
		
		CellPhone cell1= new CellPhone();
		cell1.brand = "iPhone";
		cell1.color = "Rose Gold";
		cell1.model = "XR";
		cell1.screensize = 7.5;
		cell1.price = 950;
		
		CellPhone cell2= new CellPhone("Samsung",600,"balck",8, "Galaxy note 8");
		// cell2.getInfo();
		
//		cell1.Call(2027254302);
//		cell1.SendMessage(2027254302);
//		
//		
	}

}
