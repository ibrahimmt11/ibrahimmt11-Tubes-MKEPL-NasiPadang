package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Movie m1 = new Movie("Shang-chi", 132);
        m1.printMovieinfo_1302210022();
        
        Movie m2 = new Movie("Avatar: The Way of Water", 192);
        m2.printMovieinfo_1302210022();
        
        System.out.println("===================================================");
        
        MovieTheater theater = new MovieTheater();
        Movie[] movies = {m1, m2};
        theater.setMovies_1302210022(movies);
        theater.printAllMovieInfo_1302210022();
    }
}
