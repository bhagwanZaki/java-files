import java.util.Scanner;


public class arraySum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        int sum = 0;
        for (int i  = 0; i< a.length;i++){
            a[i] = sc.nextInt();
        }
        for (int i  = 0; i< a.length;i++){
            sum += a[i];
        }
        System.out.println("sum of array is :"+sum);
    }
}
