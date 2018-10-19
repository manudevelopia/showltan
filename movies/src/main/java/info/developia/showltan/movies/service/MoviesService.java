package info.developia.showltan.movies.service;

import info.developia.showltan.movies.model.Movie;
import info.developia.showltan.movies.model.Tag;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface MoviesService {

    Optional<List<Movie>> getByTags(Set<Tag> tags);
    Optional<List<Movie>> getAll();
    Optional<List<Movie>> getByYear(LocalDate year);
}
