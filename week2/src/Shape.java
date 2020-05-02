import java.util.Scanner;

class Shape1{
    static int length,breadth,radius;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    void get(){
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("enter length/base:");
        a=sc.nextInt();
        setLength(a);
        System.out.println("enter breadth/height:");
        a=sc.nextInt();
        setBreadth(a);
        System.out.println("enter radius:");
        a=sc.nextInt();
        setRadius(a);
    }
}

class Circle extends Shape1{
    double a;
    void area()
    {
        a=  (2*3.14159*radius);
        System.out.println("circle:"+a);
    }
}

class Tri extends Shape1{
    double a;
    void area(){
        a=(0.5*length*breadth);
        System.out.println("tri:"+a);
    }

}

class Rect extends Shape1{
    double a;
    void area(){
        a= length*breadth;
        System.out.println("rect:"+a);
    }
}
public class Shape {
    public static void main(String []args){

        Shape1 a1= new Shape1();
        a1.get();

        Rect r= new Rect();
        Tri t= new Tri();
        Circle s= new Circle();

        r.area();
        t.area();
        s.area();

    }
}
