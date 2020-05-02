public class ConstructorChaining {
    int day;
    int  month,year;
    ConstructorChaining(int day, int month, int year){
        this(day,month);
        this.year=year;
    }

    ConstructorChaining(int day){
        this();
        this.day=day;
    }

    ConstructorChaining(int day, int month){
        this(day);
        this.month=month;
    }

    ConstructorChaining(){
        this.day=22;
        this.month=2;
        this.year=2020;
    }
    void display(){
        System.out.println("date:"+day+"/"+month+"/"+year);
    }

    public static void main(String []args){
        ConstructorChaining t=new ConstructorChaining(10,12);
        t.display();
    }
}
