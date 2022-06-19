package org.example.methodOrder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class DisplayNameTestA {
    @Test
    @DisplayName("test03")
    void testX1(){}
    @Test
    @DisplayName("test01")
    void testX2(){}
    @Test
    @DisplayName("test02")
    void testX3(){}
}
