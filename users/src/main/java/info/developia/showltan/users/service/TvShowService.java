package info.developia.showltan.users.service;

import info.developia.showltan.users.dto.TvShowDto;

import java.util.List;

public interface TvShowService {

    List<TvShowDto> findAllTvShows();

}
