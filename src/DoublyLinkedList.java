public class DoublyLinkedList {

    private static class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    public void deleteLast() {
        if (head==null) {
            System.out.println("List is already empty!");
            return;
        }
        if (head==tail) {
            head=null;
            tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }

    public void deleteFirst() {
        if (head==null) {
            System.out.println("List is already empty!");
            return;
        }
        if (head==tail) {
            head=null;
            tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }

    public void printBackward() {
        if (head==null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp=tail;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public void insertAt(int index, int data) {
        if (index<0) {
            System.out.println("Invalid index!");
            return;
        }
        Node newNode=new Node(data);
        if (head==null) {
            if (index>0) {
                System.out.println("Invalid index");
                return;
            }
            head=newNode;
            tail=newNode;
            return;
        }
        if (index==0) {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            return;
        }
        Node temp=head;
        for (int i=0; i<index-1 && temp!=null; i++) {
            temp=temp.next;
        }
        if (temp==null) {
            System.out.println("Index is greater than List!");
            return;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if (temp.next!=null)
            temp.next.prev=newNode;
        else {
            tail=newNode;
        }
        temp.next=newNode;
    }

    public void deleteByValue(int data) {
        if (head==null) {
            System.out.println("List is already empty!");
            return;
        }
        if (head.data==data) {
            head=head.next;
            if (head==null) {
                tail=null;
                return;
            }
            head.prev=null;
            return;
        }
        Node temp=head;
        while (temp.next!=null && temp.next.data!=data) {
            temp=temp.next;
        }
        if (temp.next==null) {
            System.out.println("Value not found in the List!");
            return;
        }
        if (temp.next.next==null) {
            temp.next=null;
            tail=temp;
            return;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }

    public void reverse() {
        if (head==null) {
            System.out.println("List is empty!");
            return;
        }
        if (head==tail) {
            return;
        }
        Node temp=null;
        Node curr=head;
        while (curr!=null) {
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        temp=head;
        head=tail;
        tail=temp;
    }

    public void addFirst(int data) {
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addLast(int data) {
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

}