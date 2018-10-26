package info.developia.showltan.users.repository;

import info.developia.showltan.users.dto.TvShowDto;

import java.util.List;

public interface TvShowRepository {

    List<TvShowDto> findAll();

}
