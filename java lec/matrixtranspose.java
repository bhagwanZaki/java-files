import java.util.*;
public class matrixtranspose {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
      

        int arr[][] = new int[3][3];
        int arr1[][] = new int[3][3];

        System.out.println("Enter the matrix element ");
        for(int i = 0 ;i<3;i++){
            System.out.println("row "+(i+1)+" elements");
            for(int j = 0; j<3;j++){
                arr[i][j] = sc.nextInt();
                
            }
        }

        for(int i = 0 ;i<3;i++){
            for(int j = 0; j<3;j++){
                arr1[i][j] = arr[j][i];
                
            }
        }

        System.out.println("Original matrix :");
		for(int i =0;i<3;i++){
			for(int j = 0;j<3;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n");
        }
        
        
        System.out.println("\n\ntranspose matrix :");
		for(int i =0;i<3;i++){
			for(int j = 0;j<3;j++){
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.print("\n");
		}
        sc.close();

    }
}
