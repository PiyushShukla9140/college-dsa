// linked list is a linear data structure in which data is stored in the form of nodes and ecah node contians data and pointer(address) to next node
// difference between array and linked list
// 1) Array has fixed size
// 2) Array is stored in contigous memory location and linked list can be stroed anywhere in the memory
// Therfoe we store address of the next node in the current node
// the last node point towards null 

// There are teo types of linked list
// 1) Single linked list
// 2) Doble linked list 
// Both can be represented as circular and non circular way

// how to create a node on the linked list
// Node(){
//     int data;
//     int next;

//     Node(int data){
//         this.data = data;
//         this.next = NULL;
//     }
// }

// leetcode 2,234,237,206,141
class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
}

public class intro{

    // treversing the linked list
    static void traverse(Node Head){
        Node curr = Head;

        while(curr!=null){
            curr = curr.next;
        }

        
    }

    //printing the linked list
    static void print(Node Head){
        Node curr = Head;

        while(curr!=null){
            System.out.print(curr.data+" => ");
            curr = curr.next;
        }

        
    }

    // searching in the linked list
    static boolean search(Node head, int value){
        Node curr = head;
        while(curr.next!=null){
            if(curr.data != value){
                return false;
            }

            curr = curr.next;
        }
        

        return true;
    }

    static int length(Node head){
        Node curr = head;
        int size = 0;
        while(curr!=null){
            curr = curr.next;
            size++;
        }

        // System.out.println(size);
        return size;
        
    }

    // to insert data at the head 
    static Node insetAtFront(Node head, int value){
        if(head==null){
            return head;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    // inserting new node at the end
    static Node insetAtEnd(Node head, int value){
        Node newNode = new Node(value);
        Node curr = head;

        if(head==null){
            return newNode;
        }
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
        
        newNode.next = null;
        return head;
        
    }

    // reverse the linked list(leetcode 206)
    static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;
        while(curr !=null){
            Node next = curr.next;

            curr.next = prev;


            prev = curr;
            curr = next;
        }

        return prev;
    }

    // returning the middle node of the linkedlist
    static Node middleLL(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null&& fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;


        }

        // 

        return slow;
    }

    // check whehter the cycle exists (leetcode 141) in linkedList and learn how to create circular linkedList
    static boolean cycleExits(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
    }



    

    public static void main(String[]args){
        // making the linked linked list
        Node newNode = new Node(1);
        newNode.next = new Node(2);
        newNode.next.next = new Node(3);
        newNode.next.next.next = newNode;
        

        
        // System.out.println(search(newNode,6));

        // print(insetAtFront(newNode,5));
        // print(insetAtEnd(newNode,6));
        // print(reverseLL(newNode));
        // Node middle = middleLL(newNode);
        // System.out.println(middle.data);
        System.out.println(cycleExits(newNode));   
    }
}