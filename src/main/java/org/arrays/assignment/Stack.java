package org.arrays.assignment;
//Stack follows Last-In_First_out principle
public class Stack {

    private int arr[];
    private int capacity;
    private int top;

    public Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = item;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public int size(){
        return top + 1;
    }

    public static void main(String args[]){
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element after pop is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
    }
}


