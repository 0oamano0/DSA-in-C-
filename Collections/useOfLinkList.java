

/*
! ArrayList
?        -stores elements in contineous memory
?        -capacity and extension
! linkedList
?        -no continous memory
?        -connect through nodes
?        -increases capacity based on insertion
?        -Types : Singly LL, Doubly LL,Circular LL(Singly and Doubly)
 */

public class useOfLinkList {
    public static void main(String[] args) {

        //! Singly LinkList
        useOfSinglyLL sm=new useOfSinglyLL();
        sm.insertAtBeginning(10);
        sm.display();
        sm.insertAtBeginning(20);
        sm.display();
        sm.insertAtBeginning(30);
        sm.display();
        sm.insertAtEnd(40);
        sm.display();
        sm.deleteAtBeginning();
        sm.display();
    }
}
