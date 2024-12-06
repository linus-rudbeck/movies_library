package se.distansakademin;

// 1. Skapa feature-fil (BDD)
// 2. Kör feature-filen
// 3. Kopiera in koden från felmeddelandet
// 4. Bygg koden och kör feature-filen igen (mål: "TODO: implement me")
// 5. Skapa testmetoden inklusive anrop m.m. (AAA) (TDD)
// 6. Lägg till kod och anrop i stegdefinitionerna
// 7. Skriv klart koden så testerna körs men misslyckas
// 8. Skriv klart koden så testerna lyckas

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final MovieLibrary movieLibrary = new MovieLibrary();

    public static void main(String[] args) {

        addInitialMovies();

        int option;

        do{
            option = runMainMenu();
            executeOption(option);
        }while(option != 0);

    }

    private static void addInitialMovies() {
        movieLibrary.addMovie("Forrest Gump", "Robert Zemeckis", 1994);
        movieLibrary.addMovie("The Matrix", "Lana Wachowski", 1999);
    }


    private static int runMainMenu() {

        System.out.println("\n");
        System.out.println("~~~~~ Main menu ~~~~~");
        System.out.println("1. View all movies");
        System.out.println("2. Add movie");
        System.out.println("3. Remove movie");
        System.out.println("4. Search movie");
        System.out.println("0. Exit");
        System.out.print("Select option: ");

        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }


    private static void executeOption(int option) {
        if (option == 0){
            System.out.println("Exit program");
        }
        else  if (option == 1){
            viewAllMovies();
        }
        else  if (option == 2){
            addMovie();
        }
        else  if (option == 3){
            System.out.println("Remove movie");
        }
        else  if (option == 4){
            System.out.println("Search movie");
        }
        else{
            System.out.println("Invalid option");
        }
    }


    private static void viewAllMovies(){
        List<Movie> movies = movieLibrary.getAllMovies();

        for (Movie movie : movies){
            System.out.println(movie);
        }
    }


    private static void addMovie(){
        System.out.print("Enter movie name:");
        String title = scanner.nextLine();

        System.out.print("Enter director name:");
        String director = scanner.nextLine();

        System.out.print("Enter release year: ");
        int year = scanner.nextInt();

        movieLibrary.addMovie(title, director, year);

        System.out.println("Movie added to the library");
    }
}