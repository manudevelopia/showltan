package info.developia.showltan.users.repository;

import info.developia.showltan.users.client.TvShowClient;
import info.developia.showltan.users.dto.TvShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TvShowRepositoryImpl implements TvShowRepository {

    @Autowired
    private TvShowClient tvShowClient;

    @Override
    public List<TvShowDto> findAll() {
        return tvShowClient.findAll();
    }

}
