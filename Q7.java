package Array_2D;
import java.util.Scanner;
public class Q7 {
	//Upper triangle of a square matrix
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row and column :");
		int n=sc.nextInt();
		int arr[][]=new int [n][n];
		insert(arr);
		display(arr);
		uppertringle(arr);
	
	}
	public static void insert(int a[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++){
				a [i][j]=sc.nextInt();
			}
		}
	}
	public static void display(int a[][]) {
		System.out.println("The matrix is :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void uppertringle(int a[][]) {
		System.out.println("The upper triangle is :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i>j)
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
