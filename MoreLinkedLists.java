package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 6/22/16.
 */
public class MoreLinkedLists {
    public static Node removeDuplicates(Node head) {
        Node temp = head;
        int count = 0;
        Node n = new Node(temp.data);

        while(temp!=null){
            if(count<temp.data){
                count = temp.data;
                n = temp;
            }
            else if(count == temp.data){
                n.next = temp.next;
            }
            temp = temp.next;
        }

        return head;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
