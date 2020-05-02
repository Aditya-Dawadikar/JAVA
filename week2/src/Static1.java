public class Static1 {

    static void print(){
        System.out.println("1");
    }

    static {
        System.out.println("2");
    }
    public static void main(String []args){
        print();            //static function called without obj
    }
}
