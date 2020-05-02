interface C{
    void print();
}

interface D{
    void show();
}

class A1 implements C,D{
    public void print(){
        System.out.println("A1 implementing C");
    }
    public void show(){
        System.out.println("A1 implementing D");
    }
}


class B1 implements C{
    public void print(){
        System.out.println("B1");
    }

    @Override
    public String toString() {
        return "overriden tostring()"+1;
    }
}

public class Interfaces {

        public static void main(String []args){
            A1 a = new A1();
            B1 b=new B1();
            a.print();
            a.show();
            b.print();
            System.out.println(a);//this will give call to original toString()=> object id
            System.out.println(b);// this line will give call to overridden toString()
        }
}
