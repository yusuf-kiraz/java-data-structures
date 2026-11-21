public class LinkedStack {

    private static class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
    Node top;

    public boolean isEmpty() {
        return (top==null);
    }

    public int peek() {
        if (top==null) 
            return -1;
        return top.data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty!");
            return -1;
        }
        int popped=top.data;
        top=top.next;
        return popped;
    }

    public void push(int data) {
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }

}
