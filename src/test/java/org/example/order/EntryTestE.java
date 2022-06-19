package org.example.order;


import org.junit.jupiter.api.*;

@DisplayName("00_EntryTestEDisplayNameTop")
public class EntryTestE {

    @Test
    public void test(){
        Assertions.assertEquals("EntryTestC", "EntryTestC");
    }
}