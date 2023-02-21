package com.aurionpro.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	private static List<Movie> movies;

	private static final String filePath = "D:\\java\\swabhavTech\\47-Movie-App\\movie.txt";

	public MovieManager() {
		super();
		movies = new ArrayList<>();
//		movies.add(new Movie(1, "ddlj", 1998, "action"));
//		movies.add(new Movie(2, "sholey", 1958, "action"));
//		movies.add(new Movie(3, "hera pheri", 1998, "comedy"));

		loadMovies();

	}

	public void addMovie(Movie movie) {
		movies.add(movie);
		saveMovies();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public static void setMovies(List<Movie> movies) {
		MovieManager.movies = movies;
	}

	private void loadMovies() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(movies);
			fos.close();
			System.out.println("task completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void saveMovies() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(filePath);
			fos.close();
			System.out.println("task completed");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteAllMovies() {
		movies.clear();
		saveMovies();
	}

	public boolean deleteMovie(int id) {
		int index = -1;
		for (int i = 0; i < movies.size(); i++) {
			if (movies.get(i).getId() == id) {
				index = i;
			}
		}
		if (index != -1) {
			movies.remove(index);
			saveMovies();
			return true;
		}
		return false;
	}
}
