package info.developia.showltan.movies.service;

import info.developia.showltan.movies.model.Movie;
import info.developia.showltan.movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MoviesServiceImpl implements MoviesService {

    private MoviesRepository moviesRepository;

    @Autowired
    public MoviesServiceImpl(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public Optional<List<Movie>> getAll() {
        return Optional.of(moviesRepository.findAll());
    }

    @Override
    public Optional<List<Movie>> getByYear(LocalDate year) {
        return moviesRepository.findByYear(year);
    }

}
