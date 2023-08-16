package org.javaCore.jdbc.test;

import lombok.extern.log4j.Log4j2;
import org.javaCore.jdbc.domain.Producer;
import org.javaCore.jdbc.service.ProducerServiceRowSet;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(5).name("MadHouse").build();

        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        log.info("---------------------------------------");

        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("TOEI");
        log.info("Producers found: '{}'", producers);
    }
}
