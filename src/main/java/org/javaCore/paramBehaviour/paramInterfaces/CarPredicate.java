package org.javaCore.paramBehaviour.paramInterfaces;

import org.javaCore.paramBehaviour.domain.CarBehaviour;
@FunctionalInterface
public interface CarPredicate {
    boolean test(CarBehaviour carBehaviour);
}
