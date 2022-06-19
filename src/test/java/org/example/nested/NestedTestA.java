package org.example.nested;


import org.junit.jupiter.api.*;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class NestedTestA {

    @Nested
    @Order(3)
    class WhenLoginAOrder3 {
        @Test
        public void test(){
            Assertions.assertEquals("NestedTestA-WhenLoginA", "NestedTestA-WhenLoginA");
        }
    }
    @Nested
    @Order(1)
    class WhenLoginBOrder1 {
        @Test
        public void test(){
            Assertions.assertEquals("NestedTestA-WhenLoginB", "NestedTestA-WhenLoginB");
        }
    }
    @Nested
    @Order(2)
    class WhenLoginCOrder2 {
        @Test
        public void test(){
            Assertions.assertEquals("NestedTestA-WhenLoginC", "NestedTestA-WhenLoginC");
        }
    }
}