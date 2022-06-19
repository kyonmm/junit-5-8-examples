package org.example.csv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceTestA {
    @ParameterizedTest
    @CsvSource(value = {
            "apple,150000",
            "orange,200000",
            "'beef, chicken',0xF2F3F",
            "sushi,1_500_000"
    })
    void underscore(String food, int rank) {
        Assertions.assertTrue(100000 < rank , "%s is lower than 100000".formatted(food));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "apple,             150000",
            "orange,            200000",
            "'beef, chicken',   0xF2F3F",
            "sushi,             1_500_000"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void ignoreWhiteSpace(String food, int rank) {
        Assertions.assertTrue(100000 < rank , "%s is lower than 100000".formatted(food));
    }
}
