import java.util.Scanner;

// method overloading is only for method

//Method overloading
// definition :- method of the same class having same name but they differ in either number of parameter or type of parameters

class Overload{
    void m1(){
        System.out.println("Null");
    }
    void m1(int a){
        System.out.println("this method with 1 integer");
       
    }
    void m1(int a,int b){
        System.out.println("this method with 2 integer");
        
    }
    void m1(int a,double b){
        System.out.println("this method with 1 integer & 1 double");
        
    }

    double area(double r){
        double ar = 3.14*r*r;
        return ar;
    }
    double area(double l , double b){
        double ar = l*b;
        return ar;
    }
}

class MyMain{
    public static void main(String[] args) {
        Overload ob = new Overload();
        Scanner sc = new Scanner(System.in);
        ob.m1();
        ob.m1(1);
        ob.m1(1,1);
        ob.m1(1,1.43);
        System.out.println("Enter r,l,b");
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double ans1 = ob.area(a);
        double ans2 = ob.area(b,c);
        
        System.out.println("Area of circle is "+ans1);
        System.out.println("Area of Rect is "+ans2);

        sc.close();
    }
}