//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
         head = reverse(head);
    
    // Add 1 to the number
    Node current = head;
    int carry = 1;
    
    while (current != null) {
        int sum = current.data + carry;
        current.data = sum % 10;
        carry = sum / 10;
        
        if (carry == 0) {
            break;
        }
        
        if (current.next == null) {
            Node newNode = new Node(carry);
            current.next = newNode;
            break;
        }
        
        current = current.next;
    }
    
    // Reverse the linked list back to the original order
    head = reverse(head);
    
    return head;
}

// Function to reverse a linked list
public static Node reverse(Node head) {
    Node prev = null;
    Node current = head;
    Node next;
    
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    
    return prev;
    }
}
