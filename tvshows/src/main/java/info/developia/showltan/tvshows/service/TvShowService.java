package info.developia.showltan.tvshows.service;

import info.developia.showltan.tvshows.model.TvShow;

import java.util.Optional;
import java.util.Set;

public interface TvShowService {

    Optional<Set<TvShow>> getByTags(Set<String> tags);

}
