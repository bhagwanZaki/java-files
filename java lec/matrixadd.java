//WAP to find the summation of elements of matrix

import java.util.*;

public class matrixadd {
    public static void main(String[] args) {
        int sum = 0;
        int a[][] = new int[3][3];
        System.out.println("Enter the element of matrix");

        Scanner sc = new Scanner(System.in);
        for(int i =0;i<3;i++){
            System.out.println("row "+(i+1)+" elements");5
            for(int j =0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                sum += a[i][j];
            }
        }

        System.out.println("Summation of elements of matrix is "+sum);
        sc.close();
    }
}
