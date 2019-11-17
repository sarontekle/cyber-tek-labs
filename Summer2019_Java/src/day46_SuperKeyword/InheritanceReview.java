package day46_SuperKeyword;

class Data{
	public  int num1 =10;
    protected  int num2 = 20;
    private  int num3 = 30;
    int num4 = 40;

}

public class InheritanceReview extends Data{
	          //sub                   //super
	
	/*
	 public  int num1 =10;
    protected  int num2 = 20;
    int num4 = 40;	 
	 */
	
	static int staticNum;
    int insNum;
    
    public void mm() {
        System.out.println( this.insNum );
    }
public static void main(String[] args) {
	// System.out.println(this.insNum); can not call instance variables in a static method.
	
	InheritanceReview obj= new InheritanceReview();
	System.out.println(obj.num1);
	System.out.println(obj.num2);
	System.out.println(obj.num4);
//	System.out.println(obj.num3); private is not inheritable
System.out.println("==============================================");
	Data obj2= new Data();
	System.out.println(obj2.num1);
	System.out.println(obj2.num2);
	System.out.println(obj2.num4);
	System.out.println("============================================");
	
	InheritanceReview obj3= new InheritanceReview();
	obj3.staticNum=100;
	obj3.insNum=200;
	
	InheritanceReview obj4= new InheritanceReview();
	obj4.staticNum=300;
	obj4.insNum=500;
	
	System.out.println(obj3.insNum);
	System.out.println(obj4.insNum);
	System.out.println();
	System.out.println(obj3.staticNum);
	System.out.println(obj4.staticNum);
	
}

}
