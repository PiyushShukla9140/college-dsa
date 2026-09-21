/*
Constructor chaining means calling one constructor from another constructor.

The purpose is to reuse constructor code instead of writing the same initialization again.

There are two types:

Within the same class → this()
Between parent and child classes → super()


3. this() vs super()
Keyword	            Calls	                                        Purpose
this()	        Another constructor of same class	        Constructor chaining within class
super()	        Constructor of parent class	                Constructor chaining between parent/child
 */


// this() must be the first statement inside a constructor.

// within class
class Student {

    String name;
    int age;

    Student() {
        this("Piyush", 22);
        System.out.println("No-argument constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor");
    }
}

// between parent and child
class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog constructor");
    }
}


public class ConstructorChaining{
    public static void main(String[]args){
        Student s = new Student();
        /*
        new Student()
            ↓
        Student()
            ↓
        this("Piyush", 22)
            ↓
        Student(String name, int age)
            ↓
        initializes name and age
        prints "Parameterized constructor"
            ↓
        returns to Student()
            ↓
        prints "No-argument constructor"
         */




        Dog d = new Dog();
        /*
        Dog()
          ↓
        super()
          ↓
        Animal()
          ↓
        Dog()
         */

    }
}