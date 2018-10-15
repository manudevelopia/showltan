package info.developia.showltan.users.repository;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.model.Tag;

import java.util.Optional;
import java.util.Set;

public interface MovieRepositoy {

    Optional<Movie> findById(String id);
    Optional<Movie> findByIds(Set<String> ids);
    Optional<Movie> findByTitle(String title);
    Optional<Set<Movie>> findByDirector(String director);
    Optional<Set<Movie>> findByTags(Set<Tag> tags);
}
