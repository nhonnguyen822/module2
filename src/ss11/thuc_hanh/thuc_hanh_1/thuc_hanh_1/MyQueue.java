package ss11.thuc_hanh.thuc_hanh_1.thuc_hanh_1;

import java.util.Arrays;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (this.isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            int removedItem = queueArr[head];
            queueArr[head] = 0;
            head = (head + 1) % capacity;
            currentSize--;
            System.out.println("Pop operation done! Removed: " + removedItem);
        }
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "queueArr=" + Arrays.toString(queueArr) +
                '}';
    }
}
