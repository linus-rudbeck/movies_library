# Movies Library

## Overview

The **Movies Library** project is a simple command-line application written in Java to manage a collection of movies. It allows users to view, add, remove, and search for movies. This project demonstrates core programming concepts such as object-oriented design, user input handling, and basic testing methodologies.

The project also incorporates Behavior-Driven Development (BDD) and Test-Driven Development (TDD) practices, using Cucumber for feature testing and JUnit for unit testing.

## Features

1. **Movie Management:**
    - View all movies.
    - Add new movies with a title, director, and release year.
    - Remove movies by title.
    - Search for movies by title.

2. **Command-Line Interface:**
    - Intuitive menu-driven navigation.
    - Input validation for user selections.

3. **Testing:**
    - BDD tests for features such as adding, removing, searching, and viewing movies.
    - JUnit unit tests for core functionality.

## Project Structure

- **Main Application:**
    - `Main.java`: The entry point for the application. Handles user input and invokes functionality for managing the movie library.
    - `MovieLibrary.java`: Provides core functionality for managing the collection of movies.
    - `Movie.java`: Represents a movie with attributes like title, director, and release year.

- **Testing:**
    - `stepdefs/MovieLibrarySteps.java`: Cucumber step definitions for BDD scenarios.
    - `tests/MovieLibraryTests.java`: JUnit tests for validating core functionality.
    - `resources/features`: Contains feature files for BDD scenarios (e.g., adding, removing, searching movies).

This project is a practical exercise in Java programming and testing principles, aimed at solidifying foundational skills while building a functional movie library system.
