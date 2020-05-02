package ExceptionHandling;

import java.io.IOException;

public class ThrowsException {

    void a() throws IOException {
        int a=9,b=0,c;
        c=a/b;
    }
    public static void main(String args[]) throws IOException {
        ThrowsException te= new ThrowsException();
        te.a();

    }
}
/*
* throws is used to declare an exception but it wont handle the exception. use of Throws is not a good programming practice
*/