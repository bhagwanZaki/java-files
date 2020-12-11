import java.util.Scanner;

class basic{

int add(int a,int b){
int c = a+b;
return c;
}

void disp(){
System.out.println("hello moto");
}

int fact(int k){

disp();
if (k > 0) {
      return k * fact(k - 1);
    } else {
      return 1;
    }

}

public static void main (String arg[]){

int ans,a,b,c;
basic ob = new basic();
Scanner sc = new Scanner(System.in);

System.out.println("enter 2 number");
b = sc.nextInt();
c = sc.nextInt();

ans = ob.add(b,c);
System.out.println(ans);
ob.disp();
a = ob.fact(3);
System.out.println(a);
}

}                        