
public class Inner_member {


    private int data=30;

    class Inner{

        void msg(){
            System.out.println("data is "+data);
        }

    }

    public static void main(String args[]){
        Inner_member obj=new Inner_member();
        Inner_member.Inner in=obj.new Inner();
        in.msg();
    }
}