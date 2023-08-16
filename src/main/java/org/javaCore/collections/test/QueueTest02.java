package org.javaCore.collections.test;

import org.javaCore.collections.domain.Comics;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Comics> comicsQueue = new PriorityQueue<>(new ComicsPriceComparator().reversed());
        comicsQueue.add(new Comics(5L,"Spiderman", 19.9, 5));
        comicsQueue.add(new Comics(7L,"Hulk", 15.9, 0));
        comicsQueue.add(new Comics(1L, "Superman", 20.00, 2));
        comicsQueue.add(new Comics(6L, "Batman", 18.90, 3));
        comicsQueue.add(new Comics(4L,"WonderWoman", 17.90, 0));
        comicsQueue.add(new Comics(2L, "Flash", 21.85, 1));
        comicsQueue.add(new Comics(3L, "Avengers", 22.50, 0));

        while (!comicsQueue.isEmpty()) {
            System.out.println(comicsQueue.poll());
        }
    }
}
