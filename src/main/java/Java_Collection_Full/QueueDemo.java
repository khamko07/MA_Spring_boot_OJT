package Java_Collection_Full;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("Task 1");
        linkedListQueue.add("Task 2");
        linkedListQueue.add("Task 3");
        
        System.out.println("Queue: " + linkedListQueue);
        System.out.println("Poll (remove first): " + linkedListQueue.poll());
        System.out.println("Queue after poll: " + linkedListQueue);
        
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);
        
        System.out.println("PriorityQueue (sorted out):");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
