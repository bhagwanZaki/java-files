import java.util.Scanner;

public class arrayfind {
    public static void main(String arg[]){
        int n,k;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array element");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the number to be searched");
        k = sc.nextInt();

        for(int i =0;i<n;i++){
            if(arr[i] == k){
                System.out.println(k +" is at index "+i);
                flag = true;
            }
        }

        if(!flag){
            System.out.println("number not found");
        }
        sc.close();
    }
}