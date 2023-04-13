package Array_2D;
import java.util.Scanner;
public class Q3 {
	//Sum of element in each row 1st type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc =new Scanner(System.in);
		System.out.println("Enter the rows and columns :");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int [r][c];
		System.out.println("Input the array elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			System.out.println("Sum of row "+i+" = "+sum);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
