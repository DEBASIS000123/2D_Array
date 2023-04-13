package Array_2D;
import java.util.Scanner;
public class Q2 {
//2nd type array input
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt();
		int arr[][]=new int [r][];
		for(int i=0;i<r;i++) {
			System.out.println("Input the size of a["+i+"] :");
			int n=sc.nextInt();
			arr[i]=new int[n];
		}
			input(arr);
			display(arr);
		
	}
		public static void input(int a[][]) {
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter the array elements :");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					a[i][j]=sc.nextInt();
				}
			}
		}
		public static void display(int a[][]) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+"\t");
				}
			System.out.println();
		}
	}

}
