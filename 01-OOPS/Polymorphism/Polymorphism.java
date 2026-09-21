// Polymorphism: When single entity takes multiple forms is known as polymorphism
//               Ek hi kaam krne ke kai tarike

// Types : Overloading(Compile time) , Overriding(Run time)
// Overloding: Same function name, but different parameters.
// Overriding:

class Calc{
    int sum(int a, int b){
        return a+b;
        
    }

    double sum(double a, double b, double c){
        return a+b+c;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

class Animal{
    void eat(){
        System.out.println("Animals can eat anyhting");
    }
}

class Deer extends Animal{
    @Override // static method ke saath yeh annotation nhi use krte error deta h
    void eat(){
        System.out.println("Deer only eats grass");
    }
}
public class Polymorphism{

    public static void main(String[]args){
        Calc c = new Calc();
        // this part c is a reference pointer and it is type of calc
        // but object kis type ka h right side dekho new keyword ke saath
        // refrence ke liye left side dekho
        // child cannot refrence parent but a parent can refrence child
        System.out.println(c.sum(1,2));

        Animal d = new Deer();
        d.eat();

        // if the method is not static then overriding will be performed
        // if method is static then oveririding will not be performed
        // Why?
        // Because static methods belong to the class, not to the individual object.
        // Java determines which static method to call based on the reference/class type, not the actual object.



    }
}

