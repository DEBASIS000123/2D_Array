package Array_2D;
import java.util.Scanner;
public class Q1 {
//1st type array input	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//CREATING 2D ARRAY
		System.out.println("Enter the rows and columns :");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int [r][c];
		input (a);
		display (a);
	}
	public static void input (int arr[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input aray elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void display(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
