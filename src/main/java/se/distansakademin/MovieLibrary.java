package se.distansakademin;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {

    List<Movie> movies = new ArrayList<>();

    public void addMovie(String title, String director, int year) {

        if (contains(title)) {
            return;
        }

        Movie movie = new Movie(title, director, year);
        movies.add(movie);
    }

    private Movie getMovieByTitle(String title){
        for (Movie movie : movies) {
            if (title.equalsIgnoreCase(movie.getTitle())) {
                return movie;
            }
        }

        return null;
    }

    public boolean contains(String title) {
        Movie movie = getMovieByTitle(title);
        return movie != null;
    }

    public void removeMovie(String title) {
        Movie movie = getMovieByTitle(title);
        movies.remove(movie);
    }

    public Movie searchMovie(String title) {
        return getMovieByTitle(title);
    }

    public List<Movie> getAllMovies() {
        return movies;
    }
}
