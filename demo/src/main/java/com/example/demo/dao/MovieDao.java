package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Movie;

public interface MovieDao {
	public List<Movie> movies();

	public Movie getMovies(Long movieId);

	public int deleteMovies(Long movieId);

	public int updateMovies(Movie movie);

	public int createMovies(Movie movie);
}
