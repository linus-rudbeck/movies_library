Feature: Adding a movie to the library

  Scenario: A movie is added to the library
    Given the movie library is open
    When the user adds a movie with the title "Forrest Gump" and director "Robert Zemeckis" and year 1994
    Then the movie "Forrest Gump" is added to the library