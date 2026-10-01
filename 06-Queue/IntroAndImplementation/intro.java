// Queue is a linear data staructure that works on the first in first out principle
// FIFO => the elements inserted first is the first elment to be removed

// Queue has two ends front enjd and rear end
// Front end is used to remove the elements
// Rear end is used to store the element the elements
// How? When you want to store the the elements, we start the inserting element from front side and move towards the rear end and then increament the rear end index and then store the another element. Therefore rear end is used to store the elements
// And if we wnat to remove the element we increament the front end of the queue the first element gets removed

// Now in this file we are going to use java collection queue implementation method

// There are two methods in queue 
// First enqueue: Inserting the elements
// Second is Dequeue: deleting the elaments from the queue
// THere also exists a peek method in queue 


import java.util.Queue;
import java.util.LinkedList;
public class intro{
    public static void main(String[]args){
        Queue <Integer> q = new LinkedList<Integer>();
        // Queue is an interface in java, It defines what a queue should be able to do, such as: q.add(10), q.remove(), q.peek(), q.isEmpty();
        // But the Queue interface itself doesn't provide the actual implementation.

        // LinkedList is an actual class that implements the Queue interface.
        // We can also use ArrayDeque class to implement Queue interface
        // Just like in OOPS when we create an interface we dont ceate object of that interface, we create a class that implements that interface and then we create an object of that class 


        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q);
        // Output [10, 20, 30 40] hear front end is at 0th element and rear end is at last element
        // Therefore while inserting element we move from front to rear and if we want to insert another element we increament the rear end not the frontend

        System.out.println(q.remove());

        // This will print the front end element because queue follows fifo principle

        System.out.println(q.peek()); // Now the front end element is 20 as 10 has been removed from the quueue

        System.out.println(q.isEmpty()); // retrun false

    }
}