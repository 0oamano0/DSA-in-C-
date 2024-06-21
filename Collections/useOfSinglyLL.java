

public class useOfSinglyLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    public useOfSinglyLL() {
        head=null;
    }
    void insertAtBeginning(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"-->"+temp.next+"-->");
            temp=temp.next;
        }
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    
    }
    void deleteAtBeginning(){
        if(head==null){
            System.out.println("List is Empty");
        }
        head=head.next;
    }
    
    
}
