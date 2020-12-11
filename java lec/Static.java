
// whenever a method or variable is declare static it is given the common share memory means we dont have to create the object to call the static method
// the main reason for java to create the static was to for interperter to call and execute the main method beacuse main is also a method and to call the method we have to create the ibject of class
// but we java interperter cannot create the object during interpetering
// so for that java created the static function
// so whenever we write java Static
// the interperter do is java Static.main()
// we can call the static method in non static method without creating the object
// but we cannot call the non static method in static method without creating the object we have to create the object of the class


//you can not declare a variable static in any method wheather that method is stataic or not 
//  STATIC VARIABLE SHOULD BE GLOBAL ONLY
/*
    from static to static            allowed
    from non-static to non-static    allowed
    from static to non-static        not allowed (can only be done by creating object )
    from non-static to static        allowed
*/


class StaticKey{
    void m3(){
        System.out.println("heug");
    }
    static void m1(){
        System.out.println("in static method");
        // m3();  this will give error because the m3 method is non static
    }

    void m2(){
        m3();
    }
}



public class Static {


    public static void main(String[] args) {
       StaticKey ob = new StaticKey();
       ob.m2();
       
        
   } 
}