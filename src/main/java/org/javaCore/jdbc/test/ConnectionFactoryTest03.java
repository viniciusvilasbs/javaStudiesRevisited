package org.javaCore.jdbc.test;

import org.javaCore.jdbc.domain.Producer;
import org.javaCore.jdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer01 = Producer.builder().name("Mappa").build();
        Producer producer02 = Producer.builder().name("White Fox").build();
        Producer producer03 = Producer.builder().name("Studio Ghibli").build();

        ProducerService.saveTransaction(List.of(producer01, producer02, producer03));

    }
}
