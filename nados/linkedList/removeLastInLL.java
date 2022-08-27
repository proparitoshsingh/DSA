import java.util.Scanner; 
public class removeLastInLL { 

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
        void removeLast(){
            if(size==0){
                System.out.println("List is empty");
                return;
            }if(size==1){
                this.head=null;
                this.tail=null;
            }else{
                Node ptr=this.head;
                for(int i=1;i<size-1;i++){
                    ptr=ptr.next;
                }ptr.next=null;
                this.tail=ptr;
            }size--;
        }
    }
    public static void main(String args[]) { 
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.display();
        ll.removeLast();
        ll.display();
    } 
}