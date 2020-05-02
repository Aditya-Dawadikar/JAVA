package MultiThreading;
// synchronized: similar to join(), a method or a block must be declared as synchronised
//              synchronised blocks all other threads from execution inorder to complete
//              execution of current thread


class Display{
    void print(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i+" ");
            synchronized(this){
                for(int j=0;j<4;j++){
                    System.out.println(j+" ");
                }
            }
        }
    }
}

class Thread1 extends Thread{
    Display t;
    Thread1(Display t){
        this.t=t;
    }
    public void run(){
        t.print(8);
    }
}

class Thread2 extends Thread{
    Display t;
    Thread2(Display t){
        this.t=t;
    }public void run(){
        t.print(9);
    }
}

public class MultiThreading6  extends Thread{

    public static void main(String []args){
        Display obj= new Display();
        Thread1 t1= new Thread1(obj);
        Thread1 t2= new Thread1(obj);
        t1.start();
        t2.start();
    }

}
