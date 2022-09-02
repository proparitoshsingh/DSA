import java.util.Scanner; 
public class kThElementFromEnd { 
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
        int kThElementEnd(int k){
            Node start=this.head;
            Node end=start;
            for(int i=0;i<k;i++){
                end=end.next;
            }while(end!=this.tail){
                end=end.next;
                start=start.next;
            }return start.data;
        }
    }
    public static void main(String args[]) { 
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        System.out.println(ll.kThElementEnd(0));
    } 
}