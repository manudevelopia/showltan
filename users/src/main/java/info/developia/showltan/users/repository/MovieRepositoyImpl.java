package info.developia.showltan.users.repository;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.model.Tag;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public class MovieRepositoyImpl implements MovieRepositoy {

    @Override
    public Optional<Movie> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Movie> findByIds(Set<String> ids) {
        return Optional.empty();
    }

    @Override
    public Optional<Movie> findByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public Optional<Set<Movie>> findByDirector(String director) {
        return Optional.empty();
    }

    @Override
    public Optional<Set<Movie>> findByTags(Set<Tag> tags) {
        return Optional.empty();
    }

}
