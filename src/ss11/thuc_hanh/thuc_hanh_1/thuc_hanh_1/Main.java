package ss11.thuc_hanh.thuc_hanh_1.thuc_hanh_1;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}
