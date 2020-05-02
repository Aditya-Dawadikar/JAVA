final class FinalClass{                             //cannot be inherited
    void print(){
        System.out.println("final class");
    }

}

public class Final {
    final int a;
    Final(){
        a=1;                                    //initialized inside constructor
    }
    final int b=4;                              // initialized directly

    final void print(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void main(String []args){
        FinalClass f= new FinalClass();
        f.print();

        Final f1= new Final();
        f1.print();
    }
}
