public class ArrayStack {
    int[] arr;
    int top;
    int capacity;

    public ArrayStack(int capacity) {
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.top=-1;
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public boolean isFull() {
        return (top==capacity-1);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        top+=1;
        arr[top]=data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty!");
            return -1;
        }
        int popped=arr[top];
        top-=1;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

}
