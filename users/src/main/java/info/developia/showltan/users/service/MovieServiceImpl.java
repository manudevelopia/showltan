package info.developia.showltan.users.service;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Optional<List<Movie>> findAll() {
        return movieRepository.findAll();
    }

}
