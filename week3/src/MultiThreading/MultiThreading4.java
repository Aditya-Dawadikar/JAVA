package MultiThreading;

public class MultiThreading4 extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String []args){
        MultiThreading4 mt1= new MultiThreading4();
        MultiThreading4 mt2= new MultiThreading4();
        MultiThreading4 mt3= new MultiThreading4();
        MultiThreading4 mt4= new MultiThreading4();

        mt1.setName("A");
        mt2.setName("B");
        mt3.setName("C");
        mt4.setName("D");

        mt1.setPriority(Thread.NORM_PRIORITY);      //normal:5
        mt2.setPriority(Thread.MAX_PRIORITY);       //max:10
        mt3.setPriority(Thread.MIN_PRIORITY);       //min:1
        mt4.setPriority(7);

        mt2.start();
        mt3.start();
        mt1.start();
        mt4.start();
    }
}
