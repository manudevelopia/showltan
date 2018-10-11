package info.developia.showltan.users.service;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.repository.MovieRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepositoy movieRepositoy;

    @Autowired
    public MovieServiceImpl(MovieRepositoy movieRepositoy) {
        this.movieRepositoy = movieRepositoy;
    }

    @Override
    public Optional<Movie> findById(String id) {
        return movieRepositoy.findById(id);
    }

    @Override
    public Optional<Movie> findByIds(Set<String> ids) {
        return movieRepositoy.findByIds(ids);
    }

    @Override
    public Optional<Movie> findByTitle(String title) {
        return movieRepositoy.findByTitle(title);
    }

    @Override
    public Optional<Set<Movie>> findByDirector(String director) {
        return movieRepositoy.findByDirector(director);
    }

}
