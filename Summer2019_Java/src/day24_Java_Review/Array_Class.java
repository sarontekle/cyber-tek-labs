package day24_Java_Review;

public class Array_Class {
	public static void main(String[] args) {
		//combining two arrays
		int[] array1= {1,2,3};
		int[] array2= {4,5,6};
		
		int[] array3= new int [array1.length+array2.length];
		for(int i=0;i<array1.length;i++) {
			array3[i]=array1[i];
		}for(int j=0;j<array2.length;j++) {
			array3[j+array1.length]=array2[j];
		}for(int i=0; i<array3.length;i++) {
			System.out.print(array3[i]+" ");
		}
	}

}
