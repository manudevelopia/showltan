package info.developia.showltan.users.service;

import info.developia.showltan.users.domain.TvShow;
import info.developia.showltan.users.repository.TvShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TvShowServiceImpl implements TvShowService {

    private final TvShowRepository tvShowRepository;

    @Autowired
    public TvShowServiceImpl(TvShowRepository tvShowRepository) {
        this.tvShowRepository = tvShowRepository;
    }

    @Override
    public Optional<List<TvShow>> findAll() {
        return tvShowRepository.findAll();
    }

}
