/*
Interface cannot contain the implemented method IT ONLY CONTAIN THE UNIMPLEMENTED METHODS

IMP things to know
    -> Every thing declare in interface is by default public
    -> all variable in the interface will be final by deafault
    -> all methods are abstract by deafault
    -> you cannot inherit any class to interface beacuse the parent class have the implemented method which is not allowed in interface
    -> if your class is abstrct and if it implements the interface then we can implement the method we want only 
    -> an interface can extends the another multiple interface
    -> interface can do nothing with a class
    -> one class can implements mulitple interface

class       extends         (1)class
interface   extends         (multiple)interface
interface   nothing         class
class       implements      (multiple)interface



*/

interface Demo  {
    void m1();      // this will be by default  public abstract void m1();
    void m2();
}

interface demo2{
    void dog();
}
abstract class second implements Demo{
    public void m1(){
        System.out.println("hi");
    }
    // here we can implement the function we want unlike the normal class where we have to implement all the method in the interface

}



class First implements Demo,demo2{
    public void m1(){
        System.out.println("in m1");
    }
    public void m2(){}
    public void dog(){  
        System.out.println("yo");
    }
    
}

public class lecs_interface {
    public static void main(String[] args) {
        First ob = new First();
        ob.m1();
        ob.m2();

        
        
    }
}
