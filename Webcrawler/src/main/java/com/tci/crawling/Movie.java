package com.tci.crawling;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String genre;
    private String format;
    private int year;
    private String director;
    private List<String> writer =new ArrayList<>();
    private List<String> stars =new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getWriter() {
        return writer;
    }

    public void setWriter(List<String> writer) {
        this.writer = writer;
    }

    public List<String> getStars() {
        return stars;
    }

    public void setStars(List<String> stars) {
        this.stars = stars;
    }

    public Movie(String name, String genre, String format, int year, String director, List<String> writer, List<String> stars) {
        this.name = name;
        this.genre = genre;
        this.format = format;
        this.year = year;
        this.director = director;
        this.writer = writer;
        this.stars = stars;
    }
}
