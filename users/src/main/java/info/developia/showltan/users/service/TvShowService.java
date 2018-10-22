package info.developia.showltan.users.service;

import info.developia.showltan.users.domain.TvShow;

import java.util.List;
import java.util.Optional;

public interface TvShowService {

    Optional<List<TvShow>> findAll();

}
