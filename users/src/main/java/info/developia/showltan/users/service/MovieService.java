package info.developia.showltan.users.service;

import info.developia.showltan.users.dto.MovieDto;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    Optional<List<MovieDto>> findAllMovies();

}
