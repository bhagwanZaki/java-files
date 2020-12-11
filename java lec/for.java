import java.util.*;

class factorial
{
public static void main(String args[])
{
// int i;
// for(i=1;i<=5;i--)
// System.out.println(i);
int i,no;
double  fact=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
no = sc.nextInt();
// factorial using for loop
//for(i=1;i<=no;i++){
//  fact*=i;
//}
// factorial using while
i = 1;
while(i<=no)
{
    fact *= i;
    i++;
} 
System.out.println("The factorial of number is "+fact);
 
}
} 