package Array_2D;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		//Matrix multification
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns of first matrix :");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int a1[][]=new int [r1][c1];
		System.out.println("Enter the no of rows and columns of secound matrix :");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int a2[][]=new int [r2][c2];
		if(c1!=r2) {
			System.out.println("Error 404!");
			System.exit(1);
		}
		System.out.println("Enter the first matrix elements :");
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				a1 [i][j]=sc.nextInt();			
			}
		}
		System.out.println("Enter the secound matrix elements :");
		for(int i=0;i<a2.length;i++) {
			for(int j=0;j<a2[i].length;j++) {
				a2 [i][j]=sc.nextInt();		
			}
		}
		if(c1==r2) {
			int m[][]=mul(a1,a2);
			System.out.println("The new matrix after multification is :");
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[i].length;j++) {
					System.out.print(m[i][j]+"   ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Matrix multification not possible .");
	}
	public static int[][] mul(int a[][],int b[][]){
		int m[][]=new int [a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				m[i][j]=0;
				for(int k=0;k<b.length;k++) {
					m[i][j]+=a[j][k]*b[k][j];
					System.out.println(m[i][j]);
				}
			}
		}
		return m;
	} 

}
