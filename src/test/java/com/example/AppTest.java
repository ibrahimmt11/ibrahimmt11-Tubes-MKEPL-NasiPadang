package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGetTitle() {
        Movie movie = new Movie("Inception", 148);
        assertEquals("Inception", movie.getTitle_1302210022());
    }

    @Test
    public void testSetTitle() {
        Movie movie = new Movie("Inception", 148);
        movie.setTitle_1302210022("The Matrix");
        assertEquals("The Matrix", movie.getTitle_1302210022());
    }

    @Test
    public void testGetDuration() {
        Movie movie = new Movie("Inception", 148);
        assertEquals(148, movie.getDuration_1302210022());
    }

    @Test
    public void testSetDuration() {
        Movie movie = new Movie("Inception", 148);
        movie.setDuration_1302210022(136);
        assertEquals(136, movie.getDuration_1302210022());
    }

    @Test
    public void testCalculatePrice() {
        Movie longMovie = new Movie("Long Movie", 160);
        assertEquals(20000, longMovie.calculatePrice_1302210022(), 0);

        Movie mediumMovie = new Movie("Medium Movie", 120);
        assertEquals(40000, mediumMovie.calculatePrice_1302210022(), 0);

        Movie shortMovie = new Movie("Short Movie", 80);
        assertEquals(30000, shortMovie.calculatePrice_1302210022(), 0);
    }

    @Test
    public void testPrintMovieInfo() {
        Movie movie = new Movie("Inception", 148);
        movie.printMovieinfo_1302210022();
        // No assertions here, as this method prints to console
        // You can use a different approach to test console output if needed
    }
}
