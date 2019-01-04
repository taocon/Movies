package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String name;
	private String genre;
	private String ageRating;
	
	
	public Movie()
	{
		
	}
	
	public Movie(String name,String genre,String ageRating)
	{
		this.name = name;
		this.genre = genre;
		this.ageRating = ageRating;
		
		
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}
}
