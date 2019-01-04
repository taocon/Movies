package com.qa.persistence.repository;

public interface MovieRepository {

	String getAllMovies();
	String createMovie(String movie);
	String deleteMovie(Long id);
	
	
}
