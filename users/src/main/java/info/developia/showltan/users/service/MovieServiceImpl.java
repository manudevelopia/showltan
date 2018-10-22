package info.developia.showltan.users.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getLastMoviesDefault")
    public Optional<List<Movie>> findAllMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(Movie.builder().title("Reservoir Dogs").director("Quentin Tarantino").build());
        movies.add(Movie.builder().title("Pulp Fiction").director("Quentin Tarantino").build());

        return Optional.of(movies);
    }

    public Optional<List<Movie>> getLastMoviesDefault() {
        List<Movie> movies = new ArrayList<>();

        movies.add(Movie.builder().title("Reservoir Dogs").director("Quentin Tarantino").build());
        movies.add(Movie.builder().title("Pulp Fiction").director("Quentin Tarantino").build());
        movies.add(Movie.builder().title("Jackie Brown").director("Quentin Tarantino").build());
        movies.add(Movie.builder().title("Death Proof").director("Quentin Tarantino").build());
        movies.add(Movie.builder().title("Django").director("Quentin Tarantino").build());
        movies.add(Movie.builder().title("Inglorious Basterds").director("Quentin Tarantino").build());
        movies.add(Movie.builder().title("The Hateful Eight").director("Quentin Tarantino").build());

        return Optional.of(movies);
    }
}
