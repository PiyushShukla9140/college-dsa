// In this file we are going to implement queue using arrayList

// In arraylist element is added at the end of the arraylist therfore it is easy to decide which is front and whih is rear

import java.util.ArrayList;
class Queue2{
    ArrayList<Integer> list = new ArrayList<>();

    // adding the element in arrayList
    void enqueue(int data){
        list.add(data);
    }

    // deleting the element from the front
    void dequeue(){
        if(list.isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }

        int value = list.get(0);
        list.remove(0);
        System.out.println("The element removed from the queue is: "+value);
        
    }

    void peek(){
        if(list.isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("The first element of the queue is: "+list.get(0));
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    void display(){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+", ");
        }

        System.out.println();
    }
}

public class arrayList{
    public static void main(String[]args){
        Queue2 q = new Queue2();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();
        q.dequeue();
        q.display();
        System.out.println(q.isEmpty());

    }
}