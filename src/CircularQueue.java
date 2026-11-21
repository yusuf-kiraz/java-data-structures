public class CircularQueue {
    int[] arr;
    int front=0;
    int rear=-1;
    int size=0;
    int capacity;

    public CircularQueue(int capacity) {
        this.capacity=capacity;
        arr=new int[capacity];
    }
    
    public boolean isFull() {
        return capacity==size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear=(rear+1)%capacity;
        arr[rear]=data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is already empty!");
            return -1;
        }
        int deleted=arr[front];
        front=(front+1)%capacity;
        size--;
        return deleted;
    }

}
