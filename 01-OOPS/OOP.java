// OOPS : A way of writing the code in object and class format
// Object is real world entity
// Class is representation of object or it can be said as the blueprint of object

// new keyword is used to crate object of the class and it also gives memory to the object created


// this keyword refres to the current class 

// static keyword is used to share same varaible or method of a given class 
// We can make properties, functions, blocks, nested classes static in java
// When constructor allocate memeory to create object, static variables takes new space in the heap


class Student{
    String name;
    int age;

    void print(){
        System.out.println(name+" "+age);
    }

}

class Employee{
    String name;
    int id, salary;
    void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);

    }

    // non Parametrized
    Employee(){
        System.out.println("Non parameterized constructor is called. ");
    }
    
    // parametrized
    Employee(String emp_name){
        this.name = emp_name;

        System.out.println(emp_name);
    }



    Employee(String emp_name, int emp_salary){
        this.name = emp_name;
        this.salary = emp_salary;
        System.out.println(name+" "+salary);
    }

    
}

public class OOP{
    public static void main(String[]args){

        // Student s = new Student();
        // s.name = "Piyush";
        // s.age = 34;
        // s.print();

        //Employee e = new Employee();
        // e.name = "Piyush";
        // e.id = 2;
        // e.salary = 50000;
        // e.display();

        Employee e2 = new Employee();
        Employee e3 = new Employee("Piyush");
        Employee e4 = new Employee("Piyush",200000);

    }
}