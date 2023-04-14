package Array_2D;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first  matrix :");
		int a=sc.nextInt();
		System.out.println("Enter the size of secound matrix :");
		int b=sc.nextInt();
		int arr1[][]=new int [a][a];
		int arr2[][]=new int [b][b];	
		insert (arr1 , arr2);
		display(arr1,arr2);
		int s[][]=sum(arr1,arr2);
		newdisplay(s);
	}
	public static void insert(int a1[][],int a2[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first array elements :");
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1.length;j++) {
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the secound array elements :");
		for(int i=0;i<a2.length;i++) {
			for(int j=0;j<a2.length;j++) {
				a2[i][j]=sc.nextInt();
			}
		}
	}
	public static void display(int a1[][],int a2[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The first array elements :");
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1.length;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The secound array elements :");
		for(int i=0;i<a2.length;i++) {
			for(int j=0;j<a2.length;j++) {
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static int [][] sum(int a1[][],int a2[][]){
		int s[][]=new int [a1.length][a1[0].length];
		for(int i=0; i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				s[i][j]=a1[i][j]+a2[i][j];
			}
		}
		return s;
	}
	public static void newdisplay(int a[][]) {
		System.out.println("The new matrix after sum is :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
