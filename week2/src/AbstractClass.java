abstract class Abs{
    abstract void print();
    static void print1(){
        System.out.println("non abstract method");
    }
}

class Der extends Abs{
    @Override
    void print() {
        System.out.println("overridden function");
    }
}

public class AbstractClass {

    public static void main(String []args){
        Abs.print1();
        Der d= new Der();
        d.print();
    }
}
