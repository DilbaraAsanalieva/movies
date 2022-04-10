package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static final MovieStore movieStore = new MovieStore();
    private static FindAble findAble =  new FindByMap();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InputException {
        Movies movies1 = new Movies();
        while (true) {
            commads();
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if(number == 1){
                movieStore.printAllMovies(movies);
            }else if(number == 2) {
                System.out.print("Write movie's name: ");
                String name = in.nextLine();
                movieStore.findMovie(movies, name);
            }
            else if (number == 3 ){
                movieStore.sortByYear(movies);
            }else if (number == 4 ){
                movieStore.sortByName(movies);}
            else if (number == 5) {
                movieStore.sortByDirector(movies);
            }else if(number == 6){
                System.out.print("Write actor's name: ");
                String actor = in.nextLine();
                findAble.findMoviesByActor(movies,actor);
            }else if(number == 7){
                System.out.print("Write director's name: ");
                String directorName = in.nextLine();
                findAble.findMoviesByDirector(movies,directorName);
            }else if(number == 8){
                System.out.print("Write movie's year: ");
                int year = in.nextInt();
                findAble.findMoviesByYear(movies,year);
            }else if(number == 9){
                System.out.print("Write actor's name: ");
                String actor = in.nextLine();
                findAble.findMoviesByActor(movies,actor);
            }else if(number == 10){
                findAble.showActorRoles(movies);
            }
        }
    }


    static void commads() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("---------------------------------------------");
    }

    static int getInt() {
        System.out.print("Write year ");
        int a = 0;
        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Wrong again, try again");
            e.printStackTrace();
        }
        return a;
    }
}
