package org.example;


import java.util.*;

public class Movie {
    private String imdbID;
    private String title;
    private String simplePlot;
    private String[] genres;
    private int year;
    private String rating;
    public Movie(String imdbID, String title, String simplePlot, String[] genres, int year, String rating) {
        this.imdbID = imdbID;
        this.title = title;
        this.simplePlot = simplePlot;
        this.genres = genres;
        this.year = year;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Movie{" + "imdbID='" + imdbID + '\'' + ", title='" + title + '\''
                + ", simplePlot='" + simplePlot + '\'' + ", genres=" + Arrays.toString(genres)
                + ", year=" + year + ", rating='" + rating + '\'' + '}';
    }
}