package info.developia.showltan.users.service;

import info.developia.showltan.users.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    Optional<List<Movie>> findAllMovies();

}
