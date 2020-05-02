package MultiThreading;

public class MultiThreading5 extends Thread{
    @Override
    protected void finalize() {                                 //finalize will be called just before Garbage collector clear the memory
        System.out.println("Garbage collector invoked");
    }
    public static void main(String []args){
        MultiThreading5 mt= new MultiThreading5();
        mt=null;
        System.gc();                        //invoking garbage collector which idk why aint invoking on call
        System.out.println("In main()");
    }
}
