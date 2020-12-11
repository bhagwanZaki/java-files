//  ********  Multilevel Inheritance  ********* 

// class Gparent{
//     void m1(){
//         System.out.println("I am in gparent");
//     }
// }

// class Parent extends Gparent{
//     void m2(){
//         System.out.println("I am in parent class");
//     }
// }

// class Child extends Parent{
//     void m3(){
//         System.out.println("I am in child class");
//     }
// }

// ************ Heriachle Inheritance *******

class Parent{
    void m1(){
        System.out.println("I am in parent class");
    }
}

class Child1 extends Parent{
    void m2(){
        System.out.println("I am in Child 1 class");
    }
}

class Child2 extends Parent{
    void m3(){
        System.out.println("I am in child2 class");
    }
}

public class inherit {
    public static void main(String[] args) {
        Child1 ob = new Child1();
        ob.m1();
        ob.m2();
        Child2 ob1 = new Child2();
        ob1.m1();
        ob1.m3();
    }
}