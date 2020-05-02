class A{
    int a,b;
    A(){
    a=1;b=2;
    }
    A(int a){
        this();
    }
    A(int a,int b){
        this(a);
        this.b=b;
    }

    void print(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}

class B extends A{
    int a,b;
    B(){
        a=2;b=3;
    }
    B(int a){
        this();
    }
    B(int a,int b){
        this.b=b;
    }

    void print(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("using super");
        System.out.println("a:"+super.a);
        System.out.println("b:"+super.b);
    }
}

public class Inheritance {
    public static void main(String []args){
        B b= new B();

        b.print();
    }
}
