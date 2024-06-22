

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
        System.out.println("Singly LL");

        sm.insertAtBeginning(10);
        sm.display();
        System.out.println();


        sm.insertAtBeginning(20);
        sm.display();
        System.out.println();


        sm.insertAtBeginning(30);
        sm.display();
        System.out.println();


        sm.insertAtEnd(40);
        sm.display();
        System.out.println();


        sm.deleteAtBeginning();
        sm.display();
        System.out.println();


        sm.insertAtPos(50, 2);
        sm.display();
        System.out.println();


        sm.deleteAtPos(2);
        sm.display();
        System.out.println();

        System.out.println("Doubly LinkList");
        //! Doubly Linklist

        useOfDoublyLL dl=new useOfDoublyLL();
        dl.insertAtFirst(10);
        dl.insertAtFirst(20);
        dl.display();


    }
}
