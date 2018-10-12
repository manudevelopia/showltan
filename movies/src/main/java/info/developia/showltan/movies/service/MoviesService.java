package info.developia.showltan.movies.service;

import info.developia.showltan.movies.model.Movies;

import java.util.Optional;
import java.util.Set;

public interface MoviesService {

	Optional<Set<Movies>> getLast();
	
}
