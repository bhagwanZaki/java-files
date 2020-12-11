/* 
anything that is done during 
compile time is called static
and during run time is called dynamic
 */

/* 
polymorphism mean having many forms
polymorphism is only applicable for method only

method overloading is a static polymorphism

when method takes one form during the runtime, it is called dynamic polymorphism
for example:- if ther e is parent class  having one method and child class inherits parent class and override the method.
              now for example we are creating referece variale of parent and we are calling the parent constructor to make the object then it will call
              the method of parent and than we with same reference variable calling the constructor of child and then call 
              the method which we inherits from parents at this point of time it will call the method ehich is there in child

parent refernce variable can call the constructor of child class,
but the object will contain only those thing which child inherited from parent

*/
class parent{
    void m1(){
        System.out.println("in m1 of parent");
    }
}
class child extends parent{
    void m1(){
        System.out.println("in child class");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        parent ob;              // refernce variable
        ob= new parent();        // object
        ob.m1();
        // parent m1 will be called

        ob= new child();        // object
        ob.m1();
        // child m1 will be called

        // this is the  dynamic polymorphism

    }
}