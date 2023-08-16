package org.javaCore.jdbcCrud.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AnimeCrud {
    Integer id;
    String name;
    int episodes;
    ProducerCrud producerCrud;
}
