package MultiThreading;

public class MultiThreading1 extends Thread{
    public void run() {                                 //run method overriding //running stage initiated
        for(int i=0;i<10;i++){
            /*try{
                Thread.sleep(1000);                     // thread sleep for 1000 milisecs
            }catch(InterruptedException e){
                e.printStackTrace();
            }*/
            System.out.print(i+" ");
        }
    }
    public static void main(String []args){
        MultiThreading1 mt= new MultiThreading1();      //new thread is created
        MultiThreading1 mt1= new MultiThreading1();
        mt.start();                                     //runnable stage
        mt1.start();                                    //runnable stage
    }
}
