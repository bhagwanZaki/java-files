import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        String dt;
        int length = 0;

        Scanner sc = new Scanner(System.in);

        dt = sc.nextLine();

        char ch[] = new char[100];
        // char copyarr[] = new char[100];

        ch = dt.toCharArray();
        System.out.println(ch);

        for(char c:ch){
            length += 1;
        }
        char copyarr[] = new char[length];

        for(int i = 0;i<length;i++){
            copyarr[i] =ch[length-1-i];

        }

        String scopy= new String(copyarr);
        System.out.println(scopy);
        
    }
}
