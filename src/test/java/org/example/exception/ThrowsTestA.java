package org.example.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThrowsTestA {
    @Test
    public void test(){
        Assertions.assertThrows(RuntimeException.class, () -> {throw new SomeException();});
        Assertions.assertThrowsExactly(SomeException.class, () -> {throw new SomeException();});
    }

    public class SomeException extends RuntimeException { }
}
