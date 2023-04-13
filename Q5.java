package Array_2D;
import java.util.Scanner;
public class Q5 {
//print major diagonal elements of a square matrix
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row and column :");
		int n =sc.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The major diagonal numbers are :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j)
					System.out.println(arr[i][j]+" ");
			}
		}
	
	}

}
