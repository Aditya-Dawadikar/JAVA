package ExceptionHandling;/*public class ExceptionHandling.ArrayException {
    public static void main(String args[]){
        try{

            int k[]= new int[-2];
        }catch(Exception obj){
            System.out.println(obj);
        }
    }
}*/

public class ArrayException {
    public static void main(String args[]) {
        int k[] = new int[2];
        try {
            k[3]=0;

        }
        catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println(obj);
        }

    }
}