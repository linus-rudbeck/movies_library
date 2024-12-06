Feature: Removing a movie from the library

  Scenario: Removing a movie from the library
    Given the movie library contains the movie "Forrest Gump" and "The Matrix"
    When the user selects "Remove movie" for the movie "Forrest Gump"
    Then the movie "Forrest Gump" should be removed from the library