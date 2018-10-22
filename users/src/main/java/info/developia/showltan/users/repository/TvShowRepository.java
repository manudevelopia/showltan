package info.developia.showltan.users.repository;

import info.developia.showltan.users.domain.TvShow;

import java.util.List;
import java.util.Optional;

public interface TvShowRepository {

    Optional<List<TvShow>> findAll();

}
