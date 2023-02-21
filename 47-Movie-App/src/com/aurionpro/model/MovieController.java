package com.aurionpro.model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieController {
	private MovieManager manager;

	public MovieController() {
		super();
		this.manager = new MovieManager();;
	}

	public MovieManager getManager() {
		return manager;
	}

	public void setManager(MovieManager manager) {
		this.manager = manager;
	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {
		int choice = 1;
		System.out.println("welcome to  menu");
		while (choice != 5) {
			System.out.println("enter 1 to add movie ");
			System.out.println("enter 2 to display movie ");
			System.out.println("enter 3 to delete all movies ");
			System.out.println("enter 4 to delete movies by id ");
			System.out.println("enter 5 to exit");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Movie movie = setMovieDetails();
				manager.addMovie(movie);
				break;

			case 2:
				List<Movie> movies = manager.getMovies();
				if (movies.size() != 0) {
					System.out.println("list of movis are: ");
					Iterator<Movie> itr = movies.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next());
					}
				} else {
					System.out.println("list is empty...");
				}
				break;
			case 3:
				if (manager.getMovies().size() != 0) {
					manager.deleteAllMovies();
					System.out.println("Delete all movies");
				} else {
					System.out.println("nothing to delete list is already empty...");
				}
				break;
			case 4:
				System.out.println("enter Id: ");
				int id = sc.nextInt();
				if (manager.deleteMovie(id)) {
					System.out.println("movie deleted");
				} else {
					System.out.println("id could not be found");
				}
			case 5:
				System.out.println("Program terminted!");
				break;

			default:
				System.out.println("invalid choice");
			}

		}

	}

	private Movie setMovieDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Movie NAME: ");
		String name = sc.nextLine();
		System.out.println("Enter Movie YEAR: ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Movie GENRE: ");
		String genre = sc.nextLine();

		return new Movie(id, name, year, genre);
	
}
}