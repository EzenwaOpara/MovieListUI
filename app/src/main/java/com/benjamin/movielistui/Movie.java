package com.benjamin.movielistui;

public class Movie {
    private String mMovieTitle;
    private String mPremiere;
    private String mDirector;
    private String mDuration;
    private String mCountry;
    private int mImageResourceId;

    public Movie(String movieTitle,String premiere, String director, String duration, String country, int imageResourceId) {
        mMovieTitle = movieTitle;
        mPremiere = premiere;
        mDirector = director;
        mDuration = duration;
        mCountry = country;
        mImageResourceId = imageResourceId;
    }

    public String getMovieTitle() {
        return mMovieTitle;
    }

    public String getPremiere() {
        return mPremiere;
    }

    public String getDirector() {
        return mDirector;
    }

    public String getDuration() {
        return mDuration;
    }

    public String getCountry() {
        return mCountry;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
