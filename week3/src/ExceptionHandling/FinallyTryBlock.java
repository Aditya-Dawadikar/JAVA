package ExceptionHandling;

public class FinallyTryBlock {
    public static void main(String args[]){
        try{
            int a=1,b=0,c;
            c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{

            System.out.println("Inside finally");
            try{
                int a=1,b=0,c;
                c=a/b;
            }
            /*catch(Exception e){
                System.out.println(e);
            }*/
            finally{
                System.out.println("Inside second");
            }

        }


    }
}
