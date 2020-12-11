class Parent{
    void m1(){
        System.out.println("I am in parent class");
    }
}

class child extends Parent{ 
   void m1(){
       System.out.println("i am in child class now");
   }
}
   class inheritance{
    public static void main(String[] args) {
        child ob = new child();
        ob.m1();
    }
}