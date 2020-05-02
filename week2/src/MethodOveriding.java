
class Base{
     void print(){
        System.out.println("base");
    }
}

class Derived extends Base{
     void print(){
        super.print();
        System.out.println("derived");
    }
}
public class MethodOveriding {

    public static void main(String []args){
        Derived b= new Derived();
        b.print();
    }
}
