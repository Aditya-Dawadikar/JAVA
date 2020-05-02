package ExceptionHandling;

public class MultipleTry {
    public static void main(String args[]){
        int a=1,b=0,c;

        try{

            try{
                //int d=1;
                c=a/b;
            }finally{
                System.out.println("Inside finally block");
            }
            //System.out.println(d);
            int arr[]=new int[2];
            try{
                System.out.println(arr[3]);
            }/*catch(ArrayIndexOutOfBoundsException abx){
                System.out.println(abx);
            }*/finally{
                System.out.println("Inside finally block");
            }

        }/*catch(Exception e){
            System.out.println(e);
        }*/finally{
            System.out.println("Inside finally block");
        }
    }
}
