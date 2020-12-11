import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String st;
        int len = 0,flag = 0;
        Scanner sc = new Scanner(System.in);

        st = sc.nextLine();

        char ch[] = new char[100];
        ch = st.toCharArray();

        for(char c:ch){
            len += 1;
        }

        char rev[] = new char[len];
        for(int i =0; i<len;i++){
            rev[i] = ch[len-1-i];
        }
        for(int i =0; i<len;i++){
            if(rev[i] != ch[i]){
                flag = 1;
                System.out.println("Not palindrome");
                break;
            }
            flag = 0;
        }
        if(flag == 0){
            System.out.println("Palindrome");
        }
        
    }
}