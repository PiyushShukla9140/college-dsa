// Circular queue IMPLEMENTATION
/*

1. What is a Circular Queue?
A Circular Queue is a queue in which the last position of the array is connected back to the first position.

Normal queue:

FRONT                         REAR
  ↓                            ↓
[10] [20] [30] [40] [50]

Circular queue conceptually behaves like:

        [0] → [1] → [2]
         ↑           ↓
        [5] ← [4] ← [3]

When rear reaches the last index, it can wrap around to index 0 if space is available.


2. Why do we need a Circular Queue?

This is the most important reason.

Consider a normal array queue of size 5:

Index:   0    1    2    3    4
        [10] [20] [30] [40] [50]
         ↑                       ↑
       front                    rear

Now remove three elements:

dequeue()
dequeue()
dequeue()

The queue becomes logically:

Index:   0    1    2    3    4
        [ ]  [ ]  [ ] [40] [50]
                     ↑       ↑
                   front    rear

There are 3 empty spaces at the beginning.

But rear is already at index 4.

If we use a normal linear queue:

if(rear == arr.length - 1)

we declare overflow.

Problem:

The array has free space, but we can't use it.

This is called wastage of space.

Circular Queue solves this.

Instead of stopping at index 4, rear can go back to index 0.

Index:   0    1    2    3    4
        [ ]  [ ]  [ ] [40] [50]
         ↑              ↑       ↑
      available        front   rear

Then:

enqueue(60)

gives:

Index:   0    1    2    3    4
        [60] [ ]  [ ] [40] [50]
         ↑              ↑
        rear           front

So the previously unused space is reused.


4. The special formula

The formula you will see everywhere is:

(rear + 1) % size

This is used to move rear to the next position circularly.

Similarly:

(front + 1) % size

moves front forward circularly.

5. Why does % make it circular?

This is the key concept.

Suppose:

size = 5

Valid indexes are:

0 1 2 3 4

Now suppose:

rear = 3;

Next position:

(rear + 1) % size

becomes:

(3 + 1) % 5
= 4 % 5
= 4

So:

3 → 4

Normal movement.

Now suppose:

rear = 4;

Next position:

(4 + 1) % 5
= 5 % 5
= 0

So:

4 → 0

This is the wrap-around.

That's the entire reason for the % size.

Remember:
0 → 1 → 2 → 3 → 4 → 0 → 1 → 2 → ...

The modulo operation makes the index wrap around.


 */



class CircularQueue{
    int [] arr;
    int size;
    int front;
    int rear;

    CircularQueue(int size){
        this.size = size;
        arr = new int[size];

        front = -1;
        rear = -1;
    }

    void enqueue(int data){
        if( (rear+1)%size == front){
            System.out.println("Queue is full");
            return;
        }

        // for first element
        if(front == -1){
            front = 0;
        }

        rear = (rear+1)%size;
        arr[rear] = data;
    }

    void dequeue(){
        if(front == -1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("The element to be removed is: "+arr[front]);

        if(front == rear){ // if there is only ine element in the queue
            front = -1;
            rear = -1;
        }else{
            front = (front+1)%size;
        }
    }

    void display(){
        if(front == -1){
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while(true){
            System.out.print(arr[i]+", ");
            if(i == rear){
                break;
            }

            i = (i+1)%size;

        }
        System.out.println();
    }
}
public class queue{
    public static void main(String[]args){
        CircularQueue cq2 = new CircularQueue(3);
        cq2.enqueue(10);
        cq2.enqueue(20);
        cq2.enqueue(30);
        cq2.display();
        cq2.dequeue();
        cq2.enqueue(40);
        cq2.display();


        
        
    }
}