package info.developia.showltan.movies.service;

import info.developia.showltan.movies.model.Movie;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface MoviesService {

    Optional<List<Movie>> getAll();
    Optional<List<Movie>> getByYear(LocalDate year);

}
