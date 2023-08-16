package org.javaCore.collections.test;

import org.javaCore.collections.domain.Comics;
import org.javaCore.collections.domain.ConsumerCollections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
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

        List<Comics> comicsConsumer01 = List.of(comic01, comic02, comic03);
        List<Comics> comicsConsumer02 = List.of(comic04, comic05, comic06);

        Map<ConsumerCollections, List<Comics>> consumerComicsMap = new HashMap<>();
        consumerComicsMap.put(consumerCollections01, comicsConsumer01);
        consumerComicsMap.put(consumerCollections02, comicsConsumer02);

        for (Map.Entry<ConsumerCollections, List<Comics>> entry : consumerComicsMap.entrySet()) {
            System.out.println("Consumidor: " + entry.getKey().getName() + " comprou os comics: ");
            for (Comics comic : entry.getValue()) {
                System.out.println("--" + comic.getComicsName());
            }
        }
    }
}
