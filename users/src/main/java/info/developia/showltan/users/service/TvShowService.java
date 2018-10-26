package info.developia.showltan.users.service;

import info.developia.showltan.users.dto.TvShowDto;

import java.util.List;
import java.util.Optional;

public interface TvShowService {

    Optional<List<TvShowDto>> findAllTvShows();

}
