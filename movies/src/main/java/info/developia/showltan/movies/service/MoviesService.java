package info.developia.showltan.movies.service;

import info.developia.showltan.movies.model.Movies;

import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

public interface MoviesService {

    Optional<Set<Movies>> getByTags(Set<String> tags);

}
