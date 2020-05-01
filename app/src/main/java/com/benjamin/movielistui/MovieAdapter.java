package com.benjamin.movielistui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MovieAdapter extends ArrayAdapter<Movie> {
    private int mImageResourceId;

    public MovieAdapter(@NonNull Context context, int resource, @NonNull List<Movie> movies) {
        super(context, 0, movies);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Movie currentMovie =getItem(position);

        View listView = convertView;
        if (listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.movies_list, parent, false);
        }
        TextView titleTV = listView.findViewById(R.id.movie_title);
        titleTV.setText(currentMovie.getMovieTitle());

        TextView premiereTV = listView.findViewById(R.id.premiere);
        premiereTV.setText(currentMovie.getPremiere());

        TextView directorTV = listView.findViewById(R.id.director);
        directorTV.setText(currentMovie.getDirector());

        TextView durationTV = listView.findViewById(R.id.duration);
        durationTV.setText(currentMovie.getDuration());

        TextView countryTV = listView.findViewById(R.id.country);
        countryTV.setText(currentMovie.getCountry());

        ImageView imageView = listView.findViewById(R.id.movie_image);
        imageView.setImageResource(currentMovie.getImageResourceId());

        return listView;
    }
}
