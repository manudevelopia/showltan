package info.developia.showltan.users.repository;

import info.developia.showltan.users.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {

    Optional<List<Movie>> findAll();

}
