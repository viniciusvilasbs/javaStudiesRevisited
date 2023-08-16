package org.javaCore.jdbc.test;

import lombok.extern.log4j.Log4j2;
import org.javaCore.jdbc.domain.Producer;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer01 = Producer.builder().name("Mappa").build();
        Producer producerToUpdate = Producer.builder().id(5).name("MadHouse").build();

//        ProducerService.save(producer01);
//        ProducerService.delete(7);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'",producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Mad");
//        log.info("Producers found and updated '{}'",producers);
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 Pictures");
//        log.info("Producers found and updated '{}'",producers);
//        ProducerService.findByNameAndDelete("A-1 Pictures");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("B or X'='X");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("sun");
//        log.info("Producers found '{}'",producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);


        /*log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        log.trace("trace");*/
    }
}
