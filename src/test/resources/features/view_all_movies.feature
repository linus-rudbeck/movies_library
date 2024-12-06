Feature: Diplaying all movies in the library

  Scenario: Diplaying all movies in the library
    Given the movie library contains the movie "Forrest Gump" and "the Matrix"
    When the user selects "View all movies"
    Then 2 movies should be displayed