package info.developia.showltan.users.repository;

import info.developia.showltan.users.client.MovieClient;
import info.developia.showltan.users.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private final MovieClient movieClient;

    @Autowired
    public MovieRepositoryImpl(MovieClient movieClient) {
        this.movieClient = movieClient;
    }

    @Override
    public List<MovieDto> findAll() {
        return movieClient.findAll();
    }

}
