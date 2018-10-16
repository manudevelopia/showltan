package info.developia.showltan.movies.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import info.developia.showltan.movies.model.Movies;
import info.developia.showltan.movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class MoviesServiceImpl implements MoviesService {

    private MoviesRepository moviesRepository;

    @Autowired
    public MoviesServiceImpl(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getLastMoviesDefault")
    public Optional<Set<Movies>> getByTags(Set<String> tags) {
        return moviesRepository.findByTags(tags);
    }

    public Optional<Set<Movies>> getLastMoviesDefault() {
        Set<Movies> movies = new HashSet<>();

        movies.add(Movies.builder().title("Reservoir Dogs").director("Quentin Tarantino").build());
        movies.add(Movies.builder().title("Pulp Fiction").director("Quentin Tarantino").build());
        movies.add(Movies.builder().title("Jackie Brown").director("Quentin Tarantino").build());
        movies.add(Movies.builder().title("Death Proof").director("Quentin Tarantino").build());
        movies.add(Movies.builder().title("Django").director("Quentin Tarantino").build());
        movies.add(Movies.builder().title("Inglorious Basterds").director("Quentin Tarantino").build());
        movies.add(Movies.builder().title("The Hateful Eight").director("Quentin Tarantino").build());

        return Optional.of(movies);
    }

}
