public class LinkedList {

    private static class Node {
    int data;
    Node next;

    public Node (int data) {
        this.data=data;
        this.next=null;
    }
}
    Node head=null;

    public int count() {
        return counter(this.head);
    }

    private int counter(Node node) {
        if (node == null)
            return 0;
        return counter(node.next) + 1;
    }

    public void addAfterEven(int data) {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                Node conn = new Node(data);
                conn.next = temp.next;
                temp.next = conn;
                return;
            }
            temp = temp.next;
        }
    }

    public void deleteLast() {
        if (head==null) {
            System.out.println("List is already empty!");
            return;
        }
        if (head.next==null)  {
            head=null;
            System.out.println("List is empty now.");
            return;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
            temp.next=null;
    }

    public int findMax() {
        if (head==null) 
            return -1;
        Node temp=head;
        int max=temp.data;
        while (temp!=null) {
            if (max<temp.data)
                max=temp.data;
            temp=temp.next;
        }
        return max;
    }

    public void printReverse() {
        printReverse(this.head);
        System.out.println();
    }

    private void printReverse(Node node) {
        if (node == null)
            return;
        printReverse(node.next);
        System.out.print(node.data + " ");
    }

    public int findMiddle() {
        if (head==null) {
            System.out.println("List is empty!");
            return -1;
        }
        Node temp1=head, temp2=head;
        while (temp2!=null && temp2.next!=null) {
            temp2=temp2.next.next;
            temp1=temp1.next;
        }
        return temp1.data;
    }
    
    public void deleteAllEven() {
        while (head!=null && head.data%2==0) {
            head=head.next;
        }
         Node temp = head;
        while (temp!=null && temp.next!=null) {
            if (temp.next.data%2==0) {
                temp.next=temp.next.next;
            } else {
                temp=temp.next;
            }
        }
    }

    public void addFirst(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data) {
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void deleteFirst() {
        if (head==null) {
            System.out.println("List is already empty!");
            return;
        }
        if (head.next==null) {
            head=null;
            return;
        }
        head=head.next;
    }

    public void insertAt(int index, int data) {
        if (index<0) {
            System.out.println("Invalid index!");
            return;
        }
        Node newNode=new Node(data);
        if (index==0) {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for (int i=0; i<index-1 && temp!=null; i++) {
            temp=temp.next;
        }
        if (temp==null) {
            System.out.println("Index is greater than List size!");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found in the List!");
            return;
        }
        temp.next = temp.next.next;
    }

    public void reverse() {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void connect(LinkedList other) {
        if (other == null || other.head == null) {
            return;
        }
        if (this.head == null) {
            this.head = other.head;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = other.head;
    }

    public void maxAtEnd() {
        if (head==null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp=head;
        int max=head.data;
        while (temp.next!=null) {
            if (max<temp.next.data)
                max=temp.next.data;
            temp=temp.next;
        }
        Node maxNode=new Node(max);
        temp.next=maxNode;
        temp=head;
        if (max==head.data) {
            head=head.next;
            return;
        }
        while (temp.next!=null && temp.next.data!=max) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public void removeConsecutiveDuplicates() {
        if (head==null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next==null) 
            return;
        Node temp=head;
        while (temp.next!=null) {
            if (temp.data==temp.next.data) {
                temp.next=temp.next.next;
            } else { 
                temp=temp.next;
            }
        }
    }

}