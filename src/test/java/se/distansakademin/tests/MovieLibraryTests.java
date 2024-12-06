package se.distansakademin.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.distansakademin.Movie;
import se.distansakademin.MovieLibrary;

import java.util.List;

public class MovieLibraryTests {

    private MovieLibrary movieLibrary;

    @BeforeEach
    public void setUp(){
        movieLibrary = new MovieLibrary();
        movieLibrary.addMovie("Forrest Gump", "Robert Zemeckis", 1994);
        movieLibrary.addMovie("Forrest Gump", "Robert Zemeckis", 1994);
        movieLibrary.addMovie("The Matrix", "Lana Wachowski", 1999);
    }

    @Test
    public void testAddMovie(){
        // Arrange
        MovieLibrary movieLibrary = new MovieLibrary();

        // Act
        movieLibrary.addMovie("Forrest Gump", "Robert Zemeckis", 1994);
        boolean movieAdded = movieLibrary.contains("Forrest Gump");

        // Assert
        Assertions.assertTrue(movieAdded, "Movie should be added to the library");
    }


    @Test
    public void testRemoveMovie(){
        // Arrange (done in setUp)

        // Act
        movieLibrary.removeMovie("Forrest Gump");
        boolean movieExists = movieLibrary.contains("Forrest Gump");

        // Assert
        Assertions.assertFalse(movieExists, "Movie should not exist in library");
    }


    @Test
    public void testSearchMovie(){
        // Arrange (done in setUp)

        // Act
        Movie movie = movieLibrary.searchMovie("Forrest Gump");

        // Assert
        Assertions.assertNotNull(movie, "Movie should be found in the library");
    }


    @Test
    public void testViewAllMovies(){
        // Arrange (done in setUp)

        // Act
        List<Movie> allMovies = movieLibrary.getAllMovies();

        // Assert
        Assertions.assertEquals(2, allMovies.size());
    }
}
