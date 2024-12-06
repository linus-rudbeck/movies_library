package se.distansakademin.stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import se.distansakademin.Movie;
import se.distansakademin.MovieLibrary;

import java.util.List;

public class MovieLibrarySteps {

    private MovieLibrary movieLibrary = new MovieLibrary();



    /*
    Shared step definitions
     */

    @Given("the movie library contains the movie {string} and {string}")
    public void the_movie_library_contains_the_movie_and(String title1, String title2) {
        movieLibrary.addMovie(title1, "", 2000);
        movieLibrary.addMovie(title2, "", 2000);
    }


    /*
    Add movie step definitions
     */

    @Given("the movie library is open")
    public void the_movie_library_is_open() {
        // No actions needed
    }

    @When("the user adds a movie with the title {string} and director {string} and year {int}")
    public void the_user_adds_a_movie_with_the_title_and_director_and_year(String title, String director, Integer year) {
        movieLibrary.addMovie(title, director, year);
    }

    @Then("the movie {string} is added to the library")
    public void the_movie_is_added_to_the_library(String title) {
        boolean movieAdded = movieLibrary.contains(title);
        Assertions.assertTrue(movieAdded, "Movie should be added to the library");
    }



    /*
    Remove movie step definitions
     */

    @When("the user selects {string} for the movie {string}")
    public void the_user_selects_for_the_movie(String action, String title) {
        if(action.equalsIgnoreCase("Remove movie")){
            movieLibrary.removeMovie(title);
        }
    }

    @Then("the movie {string} should be removed from the library")
    public void the_movie_should_be_removed_from_the_library(String title) {
        boolean movieExists = movieLibrary.contains(title);
        Assertions.assertFalse(movieExists, "Movie should not exist in library");
    }



    /*
    Search movie step definitions
     */

    private Movie searchedMovie;

    @When("the user searches for the movie {string}")
    public void the_user_searches_for_the_movie(String title) {
        searchedMovie = movieLibrary.searchMovie(title);
    }

    @Then("the movie {string} should be found in the library")
    public void the_movie_should_be_found_in_the_library(String string) {
        Assertions.assertNotNull(searchedMovie);
    }


    /*
    View all movies steps
     */

    List<Movie> allMovies;

    @When("the user selects {string}")
    public void the_user_selects(String action) {
        if(action.equalsIgnoreCase("View all movies")){
            allMovies = movieLibrary.getAllMovies();
        }
    }

    @Then("{int} movies should be displayed")
    public void movies_should_be_displayed(Integer moviesCount) {
        Assertions.assertEquals(moviesCount, allMovies.size());
    }
}

