// single level inheritance 
// Inheritance means acquiring or inheriting the properties of parent class


// single level : A single child is inheriting from single parent 


// Note: humesha pehle parent class ka constructor call hota h fir child  ka inheritance me because of constructor chaonong
// Agr koi bhi class kisi se inherit nhi krto toh voh object class me inherit krta hao


// WHY java doesnt support multiple inheritance?
// If there are two parents and a single child is inheriting from those two parents
// Now boht the parents have eat() method and child object is calling the eat method 
// Java compiler will get confused because of constructor chaining, which parent should it choose





// SINGLE LEVEL INHERITANCE
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }

    void walk(){
        System.out.println("Animal walks");
    }


}


class Monkey extends Animal{
    Monkey(){
        System.out.println("Monkey");
    }
    void breathe(){
        System.out.println("Monkey can breathe");
    }
}



// Multi Level Inheritance

class College{
    College(){
        System.out.println("BBD College");
    }

    void departments(){
        System.out.println("Colleg Has courses such as BTECH, BBA, MBA, MTECH, BPHARMA, MPHARMA etc");
    }
}

class Student extends College{
    Student(){
        System.out.println("Studnet Name: Piyush Shukla");
    }

    void course(){
        System.out.println("Student is interested in MBA");
    }

    
}

class Harry extends Student{
    void Harry(){
        System.out.println("Harry is the topper in the class");
    }
}

public class Inheritance{
    public static void main(String[]args){
        Monkey m = new Monkey();
        m.eat();

        // Student s = new Student();
        // s.departments();
        // s.course();

        Harry h =  new Harry();
        h.Harry();


    }
}