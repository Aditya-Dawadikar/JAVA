package MultiThreading;

public class MultiThreading2 extends Thread{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String []args){
        MultiThreading2 mt1= new MultiThreading2();
        MultiThreading2 mt2= new MultiThreading2();
        MultiThreading2 mt3= new MultiThreading2();
        mt1.start();
        try{
            mt1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        mt2.start();
        mt3.start();

    }
}
