package org.example.order;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(2)
public class EntryTestC {

    @Test
    public void test(){
        Assertions.assertEquals("EntryTestC", "EntryTestC");
    }
}