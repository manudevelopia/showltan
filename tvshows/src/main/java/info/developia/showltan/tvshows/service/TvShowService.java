package info.developia.showltan.tvshows.service;

import info.developia.showltan.tvshows.model.TvShow;

import java.util.List;
import java.util.Optional;

public interface TvShowService {

    Optional<List<TvShow>> getAll();

}
