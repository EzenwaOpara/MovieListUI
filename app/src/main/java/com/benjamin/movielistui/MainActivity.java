package com.benjamin.movielistui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Joker","9th OCT, 2020",
                "Joaquin Phoenix", "2h 01min", "United States", R.drawable.joker));
        movies.add(new Movie("The Hill","24th AUG, 2020",
                "Jhon De", "2h 16min", "Nigeria", R.drawable.the_hill));
        movies.add(new Movie("Dunkirk","21st JUL, 2020",
                "Chuck Jones", "1h 48min", "United States", R.drawable.dunkirk));
        movies.add(new Movie("Moonlight","28th AUG, 2020",
                "Chuck Jones", "3h 10min", "Spain", R.drawable.moonlight));
        movies.add(new Movie("BloodShot","13th MAR, 2020",
                "Vin Diesel", "1h 40min", "Ghana", R.drawable.bloodshot));
        movies.add(new Movie("Perfume: The story of a murderer","10th MAY, 2020",
                "Opara Benjamin", "1h 56min", "Canada", R.drawable.perfume));
        movies.add(new Movie("Replicas","11th JAN, 2020",
                "Billie Benjamin", "1h 46min", "United States", R.drawable.replicas));
        movies.add(new Movie("Archer: Survival is a hard game","20th OCT, 2020",
                "Mike Spence", "2h 11min", "Brazil", R.drawable.archer));
        movies.add(new Movie("Avengers: Endgame","25th AUG, 2020",
                "Bill Benjamin", "3h 25min", "Nigeria", R.drawable.avengers));
        movies.add(new Movie("io","8th SEPT, 2020",
                "Netflix", "1h 56min", "United States", R.drawable.io));
        movies.add(new Movie("Black Panther","26th SEPT, 2020",
                "Netflix", "2h 56min", "United States", R.drawable.black_panther));
        movies.add(new Movie("After","30th SEPT, 2020",
                "Netflix", "2h 46min", "United States", R.drawable.after));





        MovieAdapter adapter = new MovieAdapter(this,0, movies);
        ListView listView = findViewById(R.id.list_movies);
        listView.setAdapter(adapter);
    }
}
