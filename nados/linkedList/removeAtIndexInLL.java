import java.util.Scanner; 
public class removeAtIndexInLL { 
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
            }System.out.println();
        }
        void removeAtIndex(int idx){
            if(idx>=size){
                System.out.println("Invalid arguments");
                return;
            }if(idx==0){
                Node nbr=this.head.next;
                this.head.next=null;
                this.head=nbr;
            }else if(idx==size-1){
                Node ptr=this.head;
                for(int i=0;i<idx-1;i++){
                    ptr=ptr.next;
                }ptr.next=null;
                this.tail=ptr;
            }else{
                Node ptr=this.head;
                for(int i=0;i<idx-1;i++){
                    ptr=ptr.next;
                }Node temp=ptr.next;
                ptr.next=temp.next;
                temp.next=null;
            }size--;
        }
    }
    public static void main(String args[]) { 
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.display();
        ll.removeAtIndex(5);
        ll.display(); 
    } 
}