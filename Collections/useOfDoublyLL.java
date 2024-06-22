

public class useOfDoublyLL {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    useOfDoublyLL() {
        this.head=null;
        this.tail=null;
    }

    void insertAtFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        if(head==null){
            tail=newNode;
        }else{
            head.prev=newNode;
        }
        head=newNode;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.prev+"-->"+temp.data+"-->"+temp.next+"-->");
            temp=temp.next;
        }
    }
    
    
}
