// Abstraction means hiding the unnecessary or sensitive details and showing only the important details the user
// There are two ways to implement abstraction 
// 1) Abstract classes (doesnt apply 100 percent abstraction)
// 2) Interfaces


// Abstract classes: We cannot create any instance of this class(matlab object nhi bna skte)
//                   These classses can have boht abstract/ non abstract functions
//                   It can also have constructor

// Abstract functions are those functions which do not have any implementation in them


abstract class Animal{
    void eat(){
        System.out.println("Animal can eat anything.");
    }
    abstract void walk();

    String color;
    Animal(){
        color = "Brown";
        System.out.println(color);
    }
}
class Horse extends Animal{
    void walk(){
        System.out.println("Horse can walk");
    }

}

class Ostrich extends Animal{
    void walk(){
        System.out.println("Ostrich can walk");
    }
}
public class Abstraction{
    public static void main(String[]args){
        Horse h = new Horse();
        h.eat();
        h.walk();
    }

    

}