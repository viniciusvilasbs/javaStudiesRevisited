package org.javaCore.collections.test;

import com.sun.source.tree.WhileLoopTree;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("D");
        queue.add("B");
        queue.add("C");
        queue.add("A");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
