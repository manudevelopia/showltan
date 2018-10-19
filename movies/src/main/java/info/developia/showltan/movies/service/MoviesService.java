package info.developia.showltan.movies.service;

import info.developia.showltan.movies.model.Movies;
import info.developia.showltan.movies.model.Tag;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

public interface MoviesService {

    Optional<List<Movies>> getByTags(Set<Tag> tags);
    Optional<List<Movies>> getAll();
    Optional<List<Movies>> getByYear(LocalDate year);
}
