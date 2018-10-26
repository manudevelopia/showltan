package info.developia.showltan.users.repository;

import info.developia.showltan.users.dto.MovieDto;

import java.util.List;

public interface MovieRepository {

    List<MovieDto> findAll();

}
