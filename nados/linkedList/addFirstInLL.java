import java.util.Scanner; 

public class addFirstInLL { 
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int data){
            Node temp=new Node();
            temp.data=data;
            if(this.size==0){
                this.head=temp;
                this.tail=temp;
            }else{
                this.tail.next=temp;
                this.tail=temp;
            }this.size++;
        }
        void display(){
            for(Node temp=this.head;temp!=null;temp=temp.next){
                System.out.println(temp.data);
            }
        }
        void addFirst(int data){
            Node temp=new Node();
            temp.data=data;
            if(size==0){
                this.head=temp;
                this.tail=temp;
            }else{
                temp.next=this.head;
                this.head=temp;
            }size++;
        }
    }
    public static void main(String args[]) { 
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.display();
        ll.addFirst(0);
        ll.display();
    } 
}