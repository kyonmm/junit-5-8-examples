package org.example.methodOrder;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodNameTestA {
    @Test
    void testB(){}
    @Test
    void testA(){}
    @Test
    void test0(){}

    @Nested
    @TestMethodOrder(MethodOrderer.Alphanumeric.class)
    public class AlphanumericTestA {
        @Test
        void testB(){}
        @Test
        void testA(){}
        @Test
        void test0(){}
    }
}
