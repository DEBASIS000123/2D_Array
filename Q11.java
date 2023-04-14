package Array_2D;
import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		//Transpose of Square matrix
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns :");
		int n=sc.nextInt();
		int arr[][]=new int [n][n];
		System.out.println("Enter the arrray elemnts :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix before transpose :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
		int transpose[][]=new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				transpose[i][j]=arr[j][i];
			}
		}
			
		System.out.println("The matrix after transpose :");
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose.length;j++) {
				System.out.print(transpose[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
