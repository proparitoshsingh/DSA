import java.util.Scanner; 
public class reversePointerInLL { 

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
        void reversePointer(){
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                return;
            }else{
                Node t1=null;
                Node t2=this.head;
                for(int i=0;i<size;i++){
                    Node t3=t2.next;
                    t2.next=t1;
                    t1=t2;
                    t2=t3;
                }Node temp=this.head;
                this.head=this.tail;
                this.tail=temp;
            }
        }
    }
    public static void main(String args[]) { 
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.display();
        ll.reversePointer();
        ll.display();
    } 
}