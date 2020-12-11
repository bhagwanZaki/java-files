//WAP to check wheather matrix is symmetric or not
import java.util.*;

public class matrixsymmetric {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int[3][3];
        int flag = 0;

        System.out.println("Enter the matrix element ");
        for(int i = 0 ;i<3;i++){
            System.out.println("row "+(i+1)+" elements");
            for(int j = 0; j<3;j++){
                arr[i][j] = sc.nextInt();
                
            }
        }

        
		for(int i =0;i<3;i++){
			for(int j = 0;j<3;j++){
				if(arr[i][j] != arr[j][i]){
                    flag += 1;
                }
			}
			System.out.print("\n");
        }
        
        if(flag != 0){
            System.out.println("Non-Symmetric matrix");
        }
        else{
            System.out.println("Symmetric matrix");
        }
        sc.close();
    }
}
