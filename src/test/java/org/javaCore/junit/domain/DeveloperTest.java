package org.javaCore.junit.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChildType() {
        Employee employeeDeveloper = new Developer("1","Java");
      /*Older method:
        if (employeeDeveloper instanceof Developer) {
            Developer developer = (Developer) employeeDeveloper;
            assertEquals("Java", developer.getMainLanguage());
        }*/

//        Newer method
        if (employeeDeveloper instanceof Developer developer) {
            assertEquals("Java", developer.getMainLanguage());
        }
    }

}