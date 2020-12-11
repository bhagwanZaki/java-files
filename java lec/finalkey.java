/*
Fianl key word is use to give the a variable a costant value that cannot be change
final variable can be either local or global variable
final keyword are not used much

if a method is declare final you can access the method
but if you inherit the class having final method that method cannot be OVERRIDE but can be OVERLOADED


if a class is declare final you can create its object 
but you cannot INHERIT it
*/ 

class Finalkey{
    final void m1()   //you can access it but cannot overide it
    { 
        final int i = 10;  // you can access it but cannot modify it
        
        System.out.println(i);
    }
}

 final public class finalkey extends Finalkey{
    public static void main(String[] args) {
        Finalkey ob = new Finalkey();
        ob.m1();
    }
}