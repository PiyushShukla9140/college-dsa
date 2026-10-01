// implementing stack using arrays
// Arraylist has dynamic size but array has a fixed size 
// So wee need to get size of the stack from the user so we can define the size of the array

public class arrays{
    static class Stack{
        int arr[];
        int top;

        Stack(int size){
            arr = new int[size];
            top = -1;
        }

        void push(int data){
            if(top == arr.length-1){
                System.out.println("Stack overflow");
                return;
            }

            top++;
            arr[top] = data;
        }

        boolean isEmpty(){
            return top == -1;
        }

        int pop(){
            if(top == -1){
                System.out.println("Stack underflow");
                return -1;
            }

            int value = arr[top];
            top--;
            return value;
        }

        int peek(){
            if(top == -1){
                System.out.println("Stack underflow");
                return -1;
            }

            return arr[top];
        }

        void display(){
            if(top == -1){
                System.out.println("Stack underflow");
                return;
                
            }

            for(int i=top;i>=0;i--){
                System.out.print(arr[i]);

            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        Stack s1 = new Stack(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        s1.display();

        System.out.println("Peek: " + s1.peek());

        System.out.println("Pop: " + s1.pop());

        s1.display();


    }
}