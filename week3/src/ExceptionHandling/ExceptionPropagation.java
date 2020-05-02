package ExceptionHandling;

public class ExceptionPropagation {
    void a(){
       b();
    }
    void b(){
        c();
    }
    void c(){
        int a=1,b=0,c;
        c=a/b;
    }
    public static void main(String args[]){
        ExceptionPropagation ep= new ExceptionPropagation();
        try{
            ep.a();
        }catch(Exception r){
            System.out.println(r);
        }
    }
}
