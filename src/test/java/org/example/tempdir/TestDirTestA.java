package org.example.tempdir;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;

public class TestDirTestA {

    @Test
    public void test1(@TempDir Path dir1, @TempDir Path dir2) {
        Assertions.assertNotEquals(dir1.toAbsolutePath(), dir2.toAbsolutePath());
    }

    @TempDir
    private static Path dir3;

    @Test
    public void test2(@TempDir Path dir4){
        Assertions.assertNotEquals(dir3.toAbsolutePath(), dir4.toAbsolutePath());
    }
}
