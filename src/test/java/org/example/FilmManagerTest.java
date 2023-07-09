package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void test() {
        FilmManager manager = new FilmManager();


        String[] expected = {};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FilmManager manager = new FilmManager();
        manager.add("1");
        manager.add("2");

        String[] expected = {"1", "2"};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        FilmManager manager = new FilmManager();
        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");

        String[] expected = {"6", "5", "4", "3", "2"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void test4() {
        FilmManager manager = new FilmManager(3);
        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");

        String[] expected = {"6", "5", "4"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
