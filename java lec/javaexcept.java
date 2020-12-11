import java.util.Scanner;

public class javaexcept {
    public static void main(String[] args) {
        
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 number");

        a = sc.nextInt();
        b = sc.nextInt();
        try{
            c =a/b;
            System.out.println(c);
            try{
                c = a/b;
                System.out.println(c);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("number cannot be dividedby zero");
        }
        finally{
            System.out.println("zaki");
        }
        
    }
}
