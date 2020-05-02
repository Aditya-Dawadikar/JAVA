package ExceptionHandling;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}

public class CustomisedException {

    public static void main(String args[]){
        try{
            throw new MyException("Hello");
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
