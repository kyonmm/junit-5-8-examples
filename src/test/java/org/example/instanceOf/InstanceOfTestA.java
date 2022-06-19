package org.example.instanceOf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class InstanceOfTestA {
    @Test
    public void test(){
        Assertions.assertTrue(BigDecimal.valueOf(10.5) instanceof Object);
        Assertions.assertInstanceOf(String.class, BigDecimal.valueOf(10.5));
    }
}
