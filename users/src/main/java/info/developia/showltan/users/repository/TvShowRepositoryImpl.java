package info.developia.showltan.users.repository;

import info.developia.showltan.users.domain.TvShow;
import info.developia.showltan.users.model.Tag;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public class TvShowRepositoryImpl implements TvShowRepository {

    @Override
    public Optional<TvShow> findByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public Optional<Set<TvShow>> findByDirector(String director) {
        return Optional.empty();
    }

    @Override
    public Optional<Set<TvShow>> findByTags(Set<Tag> tags) {
        return Optional.empty();
    }

}
