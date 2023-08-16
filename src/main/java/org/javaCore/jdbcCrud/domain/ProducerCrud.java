package org.javaCore.jdbcCrud.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProducerCrud {
    Integer id;
    String name;
}
