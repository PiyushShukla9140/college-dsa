class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}



public class pallindrome{
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static boolean checkPallindrome(Node head){
        if(head == null || head.next == null){
           
            return true;
        }

        // reverse the half linked first
        // then check whether first half is equal to the second half


        Node midNode = middle(head);
        Node prev = null;
        Node curr = midNode;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // comparing boht the parts of the linkedlist
        Node right = prev;
        Node left = head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }
    public static void main(String[]args){
        Node newNode = new Node(1);
        newNode.next = new Node(2);
        newNode.next.next = new Node(2);
        newNode.next.next.next = new Node(1);

        System.out.println(checkPallindrome(newNode));


    }
}