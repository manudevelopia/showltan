package info.developia.showltan.movies.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import info.developia.showltan.movies.model.Movie;
import info.developia.showltan.movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
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
    public Optional<List<Movie>> getAll() {
        return Optional.of(moviesRepository.findAll());
    }

    @Override
    @HystrixCommand(fallbackMethod = "getLastMoviesDefault")
    public Optional<List<Movie>> getByYear(LocalDate year) {
        return moviesRepository.findByYear(year);
    }

    public Optional<Set<Movie>> getLastMoviesDefault() {
        Set<Movie> movies = new HashSet<>();

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
