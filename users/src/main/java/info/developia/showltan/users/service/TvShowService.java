package info.developia.showltan.users.service;

import info.developia.showltan.users.domain.TvShow;
import info.developia.showltan.users.model.Tag;

import java.util.Optional;
import java.util.Set;

public interface TvShowService {

    Optional<TvShow> findByTitle(String title);
    Optional<Set<TvShow>> findByDirector(String director);
    Optional<Set<TvShow>> findByTags(Set<Tag> tags);

}
