package ExceptionHandling;

import java.util.Scanner;

public class ArithException {

    public static void main(String args[]){
        int a,b=0,c;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a:");
        a=s.nextInt();
        try{
            c=a/b;
        }catch(ArithmeticException obj){
            System.out.println(obj);
        }
    }
}
