import java.util.Scanner; 
public class reverseLL { 

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
        void reverse(){
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                return;
            }else{
                Node start=this.head;
                for(int i=0;i<size/2;i++){
                    Node end=this.head;
                    for(int j=1;j<size-i;j++){
                        end=end.next;
                    }int temp=start.data;
                    start.data=end.data;
                    end.data=temp;
                    start=start.next;
                }
            }
        }
    }
    public static void main(String args[]) { 
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.display();
        ll.reverse();
        ll.display();
    } 
}