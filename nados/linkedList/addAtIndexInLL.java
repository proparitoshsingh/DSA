import java.util.Scanner; 
public class addAtIndexInLL { 

    public static class Node{
        int data;
        Node next;
    }public static class LinkedList{
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
        }void display(){
            for(Node temp=this.head;temp!=null;temp=temp.next){
                System.out.println(temp.data);
            }
        }void addAtIndex(int idx,int data){
            if(idx>size){
                System.out.println("Invalid arguments");
                return;
            }Node temp=new Node();
            temp.data=data;
            if(size==0){
                this.head=temp;
                this.tail=temp;
            }else{
                if(idx==0){
                    temp.next=this.head;
                    this.head=temp;
                }else if(idx==size){
                    this.tail.next=temp;
                    this.tail=temp;
                }
                else{
                    Node ptr=this.head;
                    for(int i=0;i<idx-1;i++){
                        ptr=ptr.next;
                    }Node join=ptr.next;
                    ptr.next=temp;
                    temp.next=join;
                }
            }size++;
        }
    }
    public static void main(String args[]) { 
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.display();
        ll.addAtIndex(2, 25);
        ll.display();
    } 
}