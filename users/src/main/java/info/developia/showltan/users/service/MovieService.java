package info.developia.showltan.users.service;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.model.Tag;

import java.util.Optional;
import java.util.Set;

public interface MovieService {

    Optional<Movie> findById(String id);
    Optional<Movie> findByIds(Set<String> id);
    Optional<Movie> findByTitle(String title);
    Optional<Set<Movie>> findByDirector(String director);
    Optional<Set<Movie>> findByTags(Set<Tag> tags);

}