package com.company;

public class QueueDriver {

    public static void main(String[] args){
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(1000);
        myQueue.insert(14);
        myQueue.insert(12);
        myQueue.insert(44);
        myQueue.view();
    }
}
