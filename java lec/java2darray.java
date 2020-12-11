import java.util.*;
public class java2darray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");

		int row_length = sc.nextInt();
		System.out.println("enter the number of columns");
		int col_length = sc.nextInt();

		int a[][] = new int[row_length][col_length];

		System.out.println("enter the elements");
		for(int i =0;i<row_length;i++){
			System.out.println("row "+(i+1)+" elements");
			for(int j = 0;j<col_length;j++){
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("elements are :");
		for(int i =0;i<row_length;i++){
			for(int j = 0;j<col_length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}

		sc.close();

	}
}