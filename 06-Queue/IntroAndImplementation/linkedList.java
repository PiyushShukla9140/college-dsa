import java.util.LinkedList;
class Queue3{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int data){
        Node newNode = new Node(data);
        if(rear==null){
            front = rear = newNode;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        

        front = front.next;
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Peek
    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    void display(){
        if(front==null){
            System.out.println("Queue is empty");
            return;

        }

        Node temp = front;

        while(temp != null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }

        System.out.println();
    }

}
public class linkedList{
    public static void main(String[]args){
        Queue3 q = new Queue3();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        System.out.println(q.peek());

    }
}