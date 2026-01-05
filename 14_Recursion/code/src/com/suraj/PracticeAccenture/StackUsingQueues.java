package com.suraj.PracticeAccenture;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x){
        q2.add(x);

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return q1.remove();
    }

    int top(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return q1.peek();
    }

    boolean isEmpty(){
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack= new StackUsingQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top Element: "+stack.top());
        System.out.println("popped: "+stack.pop());
        System.out.println("Top Element after pop: "+stack.top());
    }
}

