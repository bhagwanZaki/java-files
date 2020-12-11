class firstthread implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print("$");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }

        }
    }
}
class second implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print("=");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }

        }
    }
}


public class javathread2 {
    public static void main(String[] args) {
        firstthread ob = new firstthread();
        second ob1 = new second();
        Thread t = new Thread(ob);
        t.start();
        Thread t1 = new Thread(ob1);
        t1.start();
    }
}
