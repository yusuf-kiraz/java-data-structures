public class LinkedQueue {

    private static class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        this.next=null;
    }
}

    Node front=null;
    Node rear=null;

    public void enqueue(int data) {
        Node newNode=new Node(data);
        if (rear==null) {
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }

    public int dequeue() {
        if (front==null) {
            System.out.println("Queue is already empty!");
            return -1;
        }
        int deleted=front.data;
        front=front.next;
        if (front==null)
            rear=null;
        return deleted;
    }

    public boolean isEmpty() {
        return front==null;
    }

    public void deleteEven() {
        LinkedQueue tempQueue=new LinkedQueue();
        while(!isEmpty()) {
            int num=dequeue();
            if (num%2!=0)
                tempQueue.enqueue(num);
        }
        while (!tempQueue.isEmpty()) {
            enqueue(tempQueue.dequeue());
        }
    }

}
