import java.util.*;

// WAP TO REVERSE THE ARRAY 
public class arrayreverse {
    public static void main(String arg[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // Reversing the array
        for(int i=n-1;i>=0;i--){
            arr1[n-1-i] = arr[i];
        }

        System.out.println("\n");
        System.out.println("Reverse array is :\n");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+"\t");
        }
    }
}
