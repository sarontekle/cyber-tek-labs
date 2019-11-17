package day28_JavaRecap;

public class Quiz {
	
	public static void main(String[] args) {
		
		char[] ch= {'a','b','c'};
		int z=ch.length;
		int count=0;
		while(count<z-1) {
			count++;
		}
		System.out.println(count);
		
		
//		question #3:
		String[] names= {"Hakan","Seyfullah","Madina"};
		names[0]=names[2];
		names[2]="Safwon";
		System.out.println(names);   //gives you a hashcode because there is no Arrays.toString method in the print statement.
		
//		question #4:
		
		String[] days= {"sun", "mon" , "wed" ,"sat"};
		int wd=0;    //   0-1=-1 -1+1+2=2 2+2=4  4-1=3
		for(int i=0;i<days.length;i++) {
			switch(days[i]) {
			case "sun":
			case"sat":
				wd-=1; // when day[i]=sun  wd=-1,     when day[i]=mon ,       when day[i]=wed,      when day[i]=sat wd=4-1=3==>final result of wd after the loop.
				break;
			case "mon": 
				wd++;//                                  wd=-1+1=0
			case "wed":
				wd+=2;  //                               wd=0+2=2 ,                 wd=2+2=4
			}
		} System.out.println(wd);
	}

}
