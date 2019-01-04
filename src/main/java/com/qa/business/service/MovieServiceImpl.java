package com.qa.business.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Movie;
import com.qa.persistence.repository.MovieRepository;
import com.qa.util.JSONUtil;

public class MovieServiceImpl implements MovieService {
	
	@Inject
	private MovieRepository repo;
	
	@Inject
	private JSONUtil util;
	

	public String getAllMovies() {
		return repo.getAllMovies();
	}

	public String addMovie(String movie) {
		
	Movie movieChecker = util.getObjectForJSON(movie, Movie.class);

					
		if (movieChecker.getName().equals("titanic"))
		{
			return "Titanic is awful we are not adding this";

		}
		return repo.createMovie(movie);
	}

	public String deleteMovie(Long id) {
		// TODO Auto-generated method stub
		return repo.deleteMovie(id);
	}
	
	public void setRepo(MovieRepository repo) {
		this.repo = repo;
	}

}
