// there are two type of constructors: Shallow copy and deep copy

// Shallow copy: we dont need to create another object array to copy the propertoes of one constructor in another
// changes in s1 will directly reflect in s2 
// but when you change s2, logically there shouldnt be any change reflected in s1 but this is not the case. S1 changed too

// Deep copy: Here we create another object or another array to copy the properties of one constructor in another constructor
// This overcomes the drawback of shallow copy


class Student {

    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Shallow copy constructor
    // Student(Student s) {
    //     this.name = s.name;
    //     this.marks = s.marks;
    // }


    // deep copy constructor
    Student (Student s){
        this.marks = new int[s.marks.length];
        this.name = s.name;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s.marks[i];
        }
        
    }
}

public class ConstructorTypes {

    public static void main(String[] args) {

        Student s1 = new Student(
            "Piyush",
            new int[]{90, 80, 70}
        );

        Student s2 = new Student(s1);

        // s2.marks[0] = 100;

        // System.out.println(s1.marks[0]);
        // System.out.println(s2.marks[0]);

        // notice here after changing the values in second constructor, the changes also reflected in first constructor
        // this happened because when we use shallow copy, it creates a refrence not another object 
        // Both of them are sharing the same array, if you want to remove this drawback you need seperate arrays for boht the constructors



        // After creating the deep copy
        s2.marks[0] = 100;

        System.out.println(s1.marks[0]);
        System.out.println(s2.marks[0]);





    }
}