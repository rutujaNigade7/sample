package org.arrays.assignment;
//Queue follows FIFO (First In First Out) principle.
public class QueueUsingArray {

    private int arr[];
    private int maxSize,currentSize;
    private int front,rear;

    public QueueUsingArray(int size){
        arr = new int[size];
        maxSize = size;
        currentSize = 0;
        front = 0;
        rear = -1;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(rear == maxSize - 1){
            rear = -1;
        }

        arr[++rear] = item;
        currentSize++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int item = arr[front++];
        if(front == maxSize){
            front = 0;
        }

        currentSize--;
        return item;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public int size(){
        return currentSize;
    }
    public static void main(String args[]){
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Dequeued element is: " + queue.dequeue());
        System.out.println("Front element after dequeue is: " + queue.peek());
        System.out.println("Queue size is: " + queue.size());
    }
}
