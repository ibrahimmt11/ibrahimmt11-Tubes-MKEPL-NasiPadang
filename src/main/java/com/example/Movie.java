package com.example;

public class Movie {
    private String title;
    private int duration;
    
    public Movie(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle_1302210022() {
        return title;
    }

    public void setTitle_1302210022(String title) {
        this.title = title;
    }

    public int getDuration_1302210022() {
        return duration;
    }

    public void setDuration_1302210022(int duration) {
        this.duration = duration;
    }
    
    public double calculatePrice_1302210022(){
        if(duration > 150){
            return 50000;
        }else if(duration >= 90 && duration <= 150){
            return 40000;
        }else{
            return 30000;
        }
    }
    
    public void printMovieinfo_1302210022(){
        double price = calculatePrice_1302210022();
        System.out.println("Film dengan Judul "+ title + " memiliki harga tiket "+ price);
    }
}
