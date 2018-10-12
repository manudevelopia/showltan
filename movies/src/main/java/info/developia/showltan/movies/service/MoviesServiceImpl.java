package info.developia.showltan.movies.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import info.developia.showltan.movies.model.Movies;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class MoviesServiceImpl implements MoviesService
{

    @Override
    @HystrixCommand(fallbackMethod = "getLastMoviesDefault")
    public Optional<Set<Movies>> getLast() {
        Set<Movies> movies = new HashSet<>();

        movies.add(new Movies("Reservoir Dogs","Quentin Tarantino"));
        movies.add(new Movies("Pulp Fiction","Quentin Tarantino"));
        movies.add(new Movies("Jackie Brown","Quentin Tarantino"));
        movies.add(new Movies("Death Proof","Quentin Tarantino"));
        movies.add(new Movies("Django","Quentin Tarantino"));
        movies.add(new Movies("Inglorious Basterds","Quentin Tarantino"));
        movies.add(new Movies("The Hateful Eight","Quentin Tarantino"));

        return Optional.of(movies);
    }

    public Optional<Set<Movies>> getLastMoviesDefault(){
        Set<Movies> movies = new HashSet<>();

        movies.add(Movies.builder().title("Reservoir Dogs").director("Quentin Tarantino").build());
        movies.add(Movies.builder().title("Pulp Fiction").director("Quentin Tarantino").build());

        return Optional.of(movies);
    }
}
