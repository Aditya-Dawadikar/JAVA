package MultiThreading;

class DerivedThreadClass extends MultiThreading2{
    public void run(){
        System.out.println("derived class thread");
        for(int i=10;i<20;i++){
            System.out.print(i+" ");
        }System.out.println();
    }
}

public class MultiThreading3 extends Thread{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String []args){
        MultiThreading3 mt1= new MultiThreading3();
        mt1.start();
        try{
            mt1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        DerivedThreadClass dt= new DerivedThreadClass();
        dt.start();
    }
}
