package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void getAnEmptyPoster() {
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getPoster1() {
        FilmManager manager = new FilmManager();
        manager.add("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getPoster3() {
        FilmManager manager = new FilmManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getPoster3WithoutName() {
        FilmManager manager = new FilmManager();
        manager.add("Film 1");
        manager.add("");
        manager.add("Film 3");
        String[] expected = {"Film 1", "", "Film 3"};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getPoster3WithSymbols() {
        FilmManager manager = new FilmManager();
        manager.add("@#$");
        manager.add("");
        manager.add("Film 3");
        String[] expected = {"@#$", "", "Film 3"};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void GetLastFilmsWithQuantityEqualLimit() {
        FilmManager manager = new FilmManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void GetLastFilmsWithQuantityLessLimit() {
        FilmManager manager = new FilmManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");

        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void GetLastFilmsWithQuantityOverLimit() {
        FilmManager manager = new FilmManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getAnEmptyPosterManualLimit() {
        FilmManager manager = new FilmManager(3);
        String[] expected = {};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }
//////////////////////////////////////////////////////////////////////////////

    @Test
    public void GetLastFilmsWithQuantityEqualManualLimit() {
        FilmManager manager = new FilmManager(7);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");

        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void GetLastFilmsWithQuantityLessManualLimit() {
        FilmManager manager = new FilmManager(7);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void GetLastFilmsWithQuantityOverManualLimit() {
        FilmManager manager = new FilmManager(7);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
