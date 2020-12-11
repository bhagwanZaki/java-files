/*
Abstrcat class is a class that has more than one abstract method

Note:-
    you cannot create the object of abstract class but you can create itsreference
    abstract method should only be define inside a abstract class only 


*/

abstract class demo
{
    abstract void m1();
    void m2(){
        System.out.println("i am m2");
    }
}
public class Abstractkey extends demo {
    void m1(){
        System.out.println("i am m2");
    }
    public static void main(String[] args) {
    //refernce-variable       object
        demo ob = new Abstractkey();
        ob.m1();
        // ob.m2();    
    }
}