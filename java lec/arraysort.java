///WAP to sort an array in ascending order

import java.util.Scanner;

public class arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int len = sc.nextInt();

        int a[] = new int[len];
        System.out.println("enter the element of array");
        for (int i  = 0; i< a.length;i++){
            a[i] = sc.nextInt();
        }

        ////////////////   MY METHOD  ///////////////////

        for(int i=0;i<len;i++){
            for(int j = i;j<len;j++){
                System.out.println("i "+ i);
                System.out.println("a[i] = "+a[i]);
                System.out.println("a[j] = "+a[j]);
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
            
        }

        /////////////////   SIR'S METHOD     ////////////////

        // for(int i= 0; i<len-1;i++){
        //     for(int j = 0; j<len-1;j++){
        //         System.out.println("i "+ i);
        //         System.out.println("a[i] = "+a[i]);
        //         System.out.println("a[j] = "+a[j]);
        //         if(a[j]>a[j+1]){
        //             int temp = a[j];
        //             a[j] = a[j+1];
        //             a[j+1] =  temp;
        //         }
        //     }
        // }
        System.out.println("sorted array is :\n");
        for(int i=0;i<len;i++){
            System.out.print(a[i]+"\t");
        }
        sc.close();
    }
}
