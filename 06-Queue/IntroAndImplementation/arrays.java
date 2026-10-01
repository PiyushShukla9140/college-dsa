// In this we are implementing the linear queue using array.
// There is a limitaion of this method.
// Limitation: Suppose you have Queue of size 5 and it is full but you want to insert an element 
//             For this you will use dequeue, the first element gets removed still the last element is at the last index of the array 
//             It will again show the queue is overflow condition even if the first index of queue is empty
// In this implementation we cannot go back to the first index to insert new element after running the dequeue method
// Therefore circular queue was introduced to handle this limitation


class Queue{
        int arr[];
        int front;
        int rear;
        int size;

        Queue(int size){
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = -1;
        }

        void enqueue(int data){
            if(rear==arr.length-1){
                System.out.println("Queue Overflow");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        void dequeue(){
            if(front>rear){
                System.out.println("Queue Underlow or Queue is empty");
                return;
            }
            System.out.println("The value removed is: "+arr[front]);
            front++;
        }

        void peek(){
            if(front>rear){
                System.out.println("Queue Underlow or Queue is empty");
                return;
            }
            System.out.println("The front element of queue is: "+arr[front]);
        }

        void display(){
            if(front>rear){
                System.out.println("Queue Underlow or Queue is empty");
                return;
            }
            System.out.print("[");
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+", ");
            }
            System.out.print(arr[rear]);
            System.out.print("]");
            System.out.println();
        }


    }
public class arrays{
    
    public static void main(String[]args){
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        // q.enqueue(60);
        q.dequeue();
        q.enqueue(60);
        q.display();

    }
}