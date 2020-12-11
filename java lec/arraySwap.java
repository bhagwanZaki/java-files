import java.util.Scanner;

public class arraySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the length of array");
        int len = sc.nextInt();
        int a[] = new int[len];
        
        for (int i  = 0; i< a.length;i++){
            a[i] = sc.nextInt();
        }
       int large = a[0];
       for(int i =0 ; i<a.length;i++){
           if(large<a[i]){
               large =a[i];
           }
       }
        System.out.println("largest number is "+large);
    }
}
