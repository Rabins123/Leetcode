//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    // Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second) {
        Node head1 = reverse(first);
        Node head2 = reverse(second);

        Node curr1 = head1;
        Node curr2 = head2;
        int carry = 0;
        Node prev = null;
        Node res = null;

        while (curr1 != null || curr2 != null) {
            int sum = carry;
            if (curr1 != null) {
                sum += curr1.data;
                curr1 = curr1.next;
            }
            if (curr2 != null) {
                sum += curr2.data;
                curr2 = curr2.next;
            }
            
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            
            if (prev == null) {
                prev = newNode;
                res = prev;
            } else {
                prev.next = newNode;
                prev = newNode;
            }
        }
        
        if (carry > 0) {
            Node newNode = new Node(carry);
            prev.next = newNode;
        }
        
        return reverse(res);
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node forward = null;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}
