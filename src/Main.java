public class Main {
    public static void main(String[] args) {
        System.out.println("=== Singly Linked List ===");
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println("Count: " + list.count());
        System.out.println("Max: " + list.findMax());
        System.out.println("Middle: " + list.findMiddle());
        System.out.print("Reverse print: ");
        list.printReverse();

        System.out.println("\n=== Doubly Linked List ===");
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.addLast(1);
        dList.addLast(2);
        dList.addLast(3);
        System.out.print("Backward print: ");
        dList.printBackward();

        System.out.println("\n=== Array Stack ===");
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(10);
        arrayStack.push(20);
        System.out.println("Peek: " + arrayStack.peek());
        System.out.println("Pop: " + arrayStack.pop());

        System.out.println("\n=== Linked Stack ===");
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(100);
        linkedStack.push(200);
        System.out.println("Pop: " + linkedStack.pop());

        System.out.println("\n=== Circular Queue ===");
        CircularQueue cQueue = new CircularQueue(3);
        cQueue.enqueue(1);
        cQueue.enqueue(2);
        System.out.println("Dequeue: " + cQueue.dequeue());

        System.out.println("\n=== Linked Queue ===");
        LinkedQueue lQueue = new LinkedQueue();
        lQueue.enqueue(10);
        lQueue.enqueue(15);
        lQueue.enqueue(20);
        lQueue.deleteEven();
        System.out.println("Dequeue after deleteEven: " + lQueue.dequeue());
    }
}