package info.developia.showltan.users.service;

import info.developia.showltan.users.dto.MovieDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAllMovies();

}
