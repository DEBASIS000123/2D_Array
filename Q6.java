package Array_2D;
import java.util.Scanner;
public class Q6 {
//minor diagonal of a square matrix
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row and column :");
		int n=sc.nextInt();
		int arr[][]=new int [n][n];
		input(arr);
		display(arr);
		minordiagonal(arr);
	}
	public static void input(int a[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
	}
	public static void display(int a[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Array elements are :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void minordiagonal(int a[][]) {
		System.out.println("Minor diagonal elements are :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i+j==a.length-1)
					System.out.println(a[i][j]+" ");
			}
		}
	}

}
