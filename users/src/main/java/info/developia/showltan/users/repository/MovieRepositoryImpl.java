package info.developia.showltan.users.repository;

import info.developia.showltan.users.domain.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    @Override
    public Optional<List<Movie>> findAll() {
        return Optional.empty();
    }

}
