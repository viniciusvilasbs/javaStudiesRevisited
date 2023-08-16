package org.javaCore.collections.test;

import org.javaCore.collections.domain.Comics;
import org.javaCore.collections.domain.ConsumerCollections;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        ConsumerCollections consumerCollections01 = new ConsumerCollections("Vinicius");
        ConsumerCollections consumerCollections02 = new ConsumerCollections("Camila");

        Comics comic01 = new Comics(5L,"Spiderman", 19.9, 5);
        Comics comic02 = new Comics(7L,"Hulk", 15.9, 4);
        Comics comic03 = new Comics(1L, "Superman", 20.00, 3);
        Comics comic04 = new Comics(6L, "Batman", 18.90, 8);
        Comics comic05 = new Comics(4L,"WonderWoman", 17.90, 4);
        Comics comic06 = new Comics(2L, "Flash", 21.85, 2);
        Comics comic07 = new Comics(3L, "Avengers", 22.50, 1);

        Map<ConsumerCollections, Comics> consumerComicsMap = new HashMap<>();
        consumerComicsMap.put(consumerCollections01, comic01);
        consumerComicsMap.put(consumerCollections02, comic03);

        for (Map.Entry<ConsumerCollections, Comics> entry : consumerComicsMap.entrySet()) {
            System.out.println("Consumidor: " + entry.getKey().getName() + " comprou comics: " +
                    entry.getValue().getComicsName());
        }
    }
}
