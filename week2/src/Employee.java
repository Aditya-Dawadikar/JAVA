import java.util.*;

public class Employee {
    int  id;
    String name;
    double salary;

    


    void get(){
        System.out.println("Enter name:");
        Scanner sc= new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextDouble();
    }

    void print(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }
public static void main(String args[]){

    Employee []e= new Employee[5];
    for(int i=0;i<5;i++){
        e[i]= new Employee();
    }

    for(int i=0;i<5;i++){
        e[i].get();
        e[i].id=i;
    }
    for(int i=0;i<5;i++){
        e[i].print();
    }
}
}
