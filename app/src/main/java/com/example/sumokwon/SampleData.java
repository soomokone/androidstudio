package com.example.sumokwon;


public class SampleData {

    private String movieName;
    private String grade;

    public SampleData( String movieName, String grade){

        this.movieName = movieName;
        this.grade = grade;
    }


    public String getMovieName()
    {
        return this.movieName;
    }

    public String getGrade()
    {
        return this.grade;
    }
}