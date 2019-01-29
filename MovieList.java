import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MovieList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Choice;
        String cont = "";
        Movie movieInfo = new Movie();

        List<Movie> movies = new ArrayList<>();
        // List <Bootcamp> students = new ArrayList<>();

        populateMovie(movies);
        printTitle();
        do {
            Choice = queryUser(scan);
            sortMovies(movies, Choice);
           // printMovies(movies, movieInfo, Choice);
            cont = continueChoice(scan);
            // printCat(movies); If I get to it - cool. If not, I'll take my M :P
        } while (cont.equalsIgnoreCase("y")); // repeat loop until user chooses to quit
    } // end main

    private static void printTitle() {
        System.out.println("Welcome to the Movie List Application!");
    } // end printTitle

    private static String queryUser(Scanner scan) {
        String input;
        int valid = 0;
        do {
            System.out.println("What category are you interested in?");
            System.out.println("You can choose from the following: ");
            System.out.print("scifi, ");
            System.out.print("drama, ");
            System.out.print("animated, ");
            System.out.println("horror");

            input = scan.nextLine();
            input = input.toLowerCase();

            switch (input) { // validate user input

            case ("scifi"):
                valid = 1;

            case ("horror"):
                valid = 1;

            case ("animated"):
                valid = 1;

            case ("drama"):
                valid = 1;
            } // end switch statement
            if (valid == 0) { // if input is invalid print error message
                System.out.println("Please enter a valid category.");
            }
        } while (valid == 0);

        return input;

    } // end queryUser

    private static void printMovies(List<Movie> movies, Movie movieInfo, String Choice) {

        for (Movie mov : movies) {
            if (mov.movieGetCat().equals(Choice)) {
                System.out.println(mov.movieGetTitle());
            }
        }
    } //end printMovies
    
    private static void sortMovies(List<Movie> movies, String Choice) {
            Set <String> sorted = new TreeSet<> ();
        for (Movie mov : movies) {
            if (mov.movieGetCat().equals(Choice)) {
                sorted.add(mov.movieGetTitle());
            }           
        } //end for
      //System.out.println(sorted);   
        System.out.println(sorted); 
    } //end sortMovies

    private static void populateMovie(List<Movie> movies) {

        movies.add(new Movie("Spaceballs", "scifi"));
        movies.add(new Movie("Star Wars", "scifi"));
        movies.add(new Movie("Collosal", "scifi"));
        movies.add(new Movie("Lars & the Real Girl", "drama"));
        movies.add(new Movie("Spiderman: Into the Spiderverse", "animated"));
        movies.add(new Movie("The Happening", "horror"));
        movies.add(new Movie("Little Shop of horrors", "horror"));
        movies.add(new Movie("Mr. Hublot", "animated"));
        movies.add(new Movie("Teeth", "horror"));
        movies.add(new Movie("The Dam Keeper", "animated"));
    }

    private static String continueChoice(Scanner scan) {
        String input = "";
        do {
            System.out.println("Do you want to continue? (y/n)");
            input = scan.nextLine();
            if ((!(input.matches("[ynYN]")))) { // validate input
                System.out.println("Please enter y or n.");
            }

        } while (!(input.matches("[yYnN]")));
        return input;
    }
    /*
     * private static void printCat(List<Movie> movies) {
     * 
     * for (Movie mov : movies) { System.out.println(mov.movieGetCat()); } }
     */

} // end MovieList
