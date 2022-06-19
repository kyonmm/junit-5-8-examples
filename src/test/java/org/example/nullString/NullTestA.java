package org.example.nullString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NullTestA {
    @Test
    public void test(){
//        Assertions.assertEquals("some", null);
        Assertions.assertNull("null");
    }
}
