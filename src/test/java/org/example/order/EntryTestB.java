package org.example.order;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(1)
public class EntryTestB {

    @Test
    public void test(){
        Assertions.assertEquals("EntryTestB", "EntryTestB");
    }
}