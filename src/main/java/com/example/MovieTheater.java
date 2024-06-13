package com.example;

public class MovieTheater {
    private Movie[] movies;

    public Movie[] getMovies_1302210022() {
        return movies;
    }

    public void setMovies_1302210022(Movie[] movies) {
        this.movies = movies;
    }
    
    public void printAllMovieInfo_1302210022(){
        System.out.println("Daftar Film dalam theater ini:");
        for(int i=0; i< movies.length; i++){
            System.out.println("Film #"+(i+1)+": "+movies[i].getTitle_1302210022()+" dengan durasi "+movies[i].getDuration_1302210022()+" menit");
            movies[i].printMovieinfo_1302210022();
        }
    }   
}
