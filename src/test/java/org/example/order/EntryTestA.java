package org.example.order;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(3)
public class EntryTestA {

    @Test
    public void test(){
        Assertions.assertEquals("EntryTestA", "EntryTestA");
    }
}