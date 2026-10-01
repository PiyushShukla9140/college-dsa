 // Stack is also a linear data structure in which the first element inserted will be the last element to be removed
 // Elements are inserted from one end and removed from samd end
 // The end from which the element are entered is known as top of stack and they are removed from the same end
 // Works on LIFO (Last In First Out) or FILO (First in Last Out)

 // Opertions of stack
 // 1) Push() 2) Pop() 3) Peek().  Time complexity of these operations is same O(1)


 // Stack can be implemented using array, arraylist and linkedList
 

 // In this file we are going to implement stack using arraylist


 // leetcode 20, 155, 739, 496
import java.util.ArrayList;
 public class intro{
    static class Stack{
        static ArrayList<Integer> List = new ArrayList<>();

        public static void push(int data){
            List.add(data);
            // this function will add the data at the last of the list 
            // eg: list = {1,2,3}, if you want to add 4 then it will be added at the end {1,2,3,4}

            // therefore the element added last will be at the top of the stack autmatically
        }

        public static boolean isEmpty(){
            return List.isEmpty();
        }

        public static int pop(){
            if (List.isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int value = List.get(List.size()-1);
            List.remove(List.size()-1);
            return value;
        }

        public static int peek(){
            if (List.isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return List.get(List.size()-1);
        }


    }

    public static void main(String[]args){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
 }