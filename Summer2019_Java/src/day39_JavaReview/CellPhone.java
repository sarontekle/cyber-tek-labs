package day39_JavaReview;

public class CellPhone {
	/*
	 
	 */
    String brand;
    double price;
    String color;
    double screensize;
    String model;
  
    
    public CellPhone() {
    	
    	this.brand="iPhone";
    	this.model="10";
    	this.color="white";
    	this.price=650;
    	this.screensize= 7.5;
    	System.out.println(brand+" "+model+" "+color+" $"+price+" "+screensize+" inches");
    }
    public CellPhone(String brand, double price, String color, double screensize, String model) {
    	this.brand=brand;
    	this.price=price;
    	this.color=color;
    	this.screensize=screensize;
    	this.model=model;
    	System.out.println(brand+" "+model+" "+color+" $"+price+" "+screensize+" inches");
    	
    	
    }
 public void getInfo(String brand, String model,String color,double screensize,double price) {
	this.brand=brand;
 	this.price=price;
 	this.color=color;
 	this.screensize=screensize;
 	this.model=model;
 	System.out.println(brand+" "+model+" "+color+" $"+price+" "+screensize+" inches");
    }

  
    
    public void Call(long PhoneNum) {
    	System.out.println("==============================================");
    	System.out.println(brand+" "+model+" is calling "+PhoneNum);
    	System.out.println("-----------------------------------------------");
    }
    public void SendMessage(long PhoneNum) {
    	System.out.println("Sending messages to "+ PhoneNum);
    	System.out.println("================================================");
    }
   }
