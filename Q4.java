package Array_2D;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// sum of numbers in each columns
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns :");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int [r][c];
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr [i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr[0].length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum+=arr[j][i];
			}
			System.out.println("Sum of column "+i+" = "+sum);
		}
		System.out.println("The matrix is :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
