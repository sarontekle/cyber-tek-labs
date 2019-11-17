package day24_Java_Review;

public class Warmup_2 {
	/*
	 3. write a program that will return a minimum value from an array.
	 4. write a program that will return the second minimum value of an array.
	 */
	public static void main(String[] args) {
		int[] arr= {100, 2 , 40 , 5 , 89 , 6};
		int min=29087;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println("Minimum value is: "+min);
		
		int secondMin=380834;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<secondMin && arr[j] !=min) {
				secondMin=arr[j];
			}
		}System.out.println("Second minimum number is: "+secondMin);
	}

}
