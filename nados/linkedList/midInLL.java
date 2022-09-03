import java.util.Scanner; 
public class midInLL { 
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
        int mid(){
            Node t1=this.head;
            Node t2=this.head;
            while(t2!=this.tail){
                t2=t2.next;
                t2=t2.next;
                if(t2==null){
                    return t1.data;
                }
                t1=t1.next;
            }return t1.data;
        }
    }
    public static void main(String args[]) { 
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.display();
        System.out.println(ll.mid());
    } 
}