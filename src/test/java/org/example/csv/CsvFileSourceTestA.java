package org.example.csv;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvFileSourceTestA {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/org/example/csv/test-data.csv")
    void test(String name, String number, boolean isJVM){
        System.out.println("%s : version %s, is JVMLang : %s".formatted(name, number, isJVM));
    }
}
