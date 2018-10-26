package info.developia.showltan.users.repository;

import info.developia.showltan.users.client.MovieClient;
import info.developia.showltan.users.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    @Autowired
    private MovieClient movieClient;

    @Override
    public List<MovieDto> findAll() {
        return movieClient.findAll();
    }

}
