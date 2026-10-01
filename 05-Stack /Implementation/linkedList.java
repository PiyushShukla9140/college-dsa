public class linkedList{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        Node top = null;

        // Push
        void push(int data) {
            Node newNode = new Node(data);

            newNode.next = top;
            top = newNode;
        }

        // Is Empty
        boolean isEmpty() {
            return top == null;
        }

        // Pop
        int pop() {
            if (top == null) {
                System.out.println("Stack underflow");
                return -1;
            }

            int value = top.data;
            top = top.next;

            return value;
        }

        // Peek
        int peek() {
            if (top == null) {
                System.out.println("Stack underflow");
                return -1;
            }

            return top.data;
        }

        // Display
        void display() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = top;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        System.out.println("Peek: " + s.peek());

        System.out.println("Pop: " + s.pop());

        s.display();
    }
}