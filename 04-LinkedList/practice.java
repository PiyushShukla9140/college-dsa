// linked list practice
// leetcode 21, 141, 

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class practice{
    public static void printLL(Node head){
        if(head==null){
            System.out.println(head);
            return;
        }

        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        if(curr==null){
            System.out.print("Null");
        }
        System.out.println();

    }

    // to find the size of the linked lisrt
    public static int sizeLL(Node head){
        if(head==null){
            return 0;
        }

        int size = 0;
        Node curr = head;
        while(curr!=null){
            curr = curr.next;
            size++;
        }

        return size;
    }

    // to search an element in the linked list
    public static boolean search(Node head, int value){
        if(head==null){
            return false;
        }

        Node curr = head;
        while(curr!=null){
            if(curr.data==value){
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    // to insert an element in the end of the linked list
    public static Node insertAtEnd(Node head, int value){
        Node newNode = new Node(value);
        if(head==null){
            return newNode;
        }

        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = null;
        return head;
    }

    // to insert an eleemnt at the start of the linked list
    public static Node insertAtFront(Node head, int value){
        Node newNode = new Node(value);
        if(head==null){
            return  newNode;
        }

        newNode.next = head;
        head = newNode;
        return head;
    }

    // to insert the element in the middle of a linked list
     public static Node insertAtMiddle(Node head, int value, int pos){

        if(pos == 1){
            return insertAtFront(head, value);
        }

        Node newNode = new Node(value);
        Node temp = head;

        for(int i = 1; i < pos - 1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }


    // to reverse a linked list
    public static Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
        // as after traversing your pointer is pointing towards last node 
    }

    // returning the middle node of the linked list
    public static int middleLL(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        }

        return slow.data;
    }

    // check whether the cycle exists in linked list or not
    public static boolean checkCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
            
        }

        return false;
    }


    public static void main(String[]args){
        Node newNode = new Node(1);
        newNode.next = new Node(2);
        newNode.next.next = new Node(3);
        newNode.next.next.next = new Node(4);
        // printLL(newNode);
        // System.out.println("The size of the linked list is: "+sizeLL(newNode));
        // System.out.println(search(newNode,3));
        
        // newNode = insertAtFront(newNode,12);
        // // printLL(insertAtEnd(newNode,5));
        printLL(reverseLL(newNode));

        // System.out.println(middleLL(newNode));
        System.out.println(checkCycle(newNode));


    }
}