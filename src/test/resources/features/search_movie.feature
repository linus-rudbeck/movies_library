Feature: Searching for a movie in the library

  Scenario: Searching for a movie in the library
    Given the movie library contains the movie "Forrest Gump" and "the Matrix"
    When the user searches for the movie "Forrest Gump"
    Then the movie "Forrest Gump" should be found in the library
