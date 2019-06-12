package info.developia.showltan.users.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import info.developia.showltan.users.dto.MovieDto;
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
    public List<MovieDto> findAllMovies() {
        return movieRepository.findAll();
    }

    public List<MovieDto> getLastMoviesDefault() {
        List<MovieDto> movieDtos = new ArrayList<>();

        movieDtos.add(MovieDto.builder().title("Reservoir Dogs").director("Quentin Tarantino").build());
        movieDtos.add(MovieDto.builder().title("Pulp Fiction").director("Quentin Tarantino").build());
        movieDtos.add(MovieDto.builder().title("Jackie Brown").director("Quentin Tarantino").build());
        movieDtos.add(MovieDto.builder().title("Death Proof").director("Quentin Tarantino").build());
        movieDtos.add(MovieDto.builder().title("Django").director("Quentin Tarantino").build());
        movieDtos.add(MovieDto.builder().title("Inglorious Basterds").director("Quentin Tarantino").build());
        movieDtos.add(MovieDto.builder().title("The Hateful Eight").director("Quentin Tarantino").build());

        return movieDtos;
    }
}
