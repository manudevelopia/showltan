package info.developia.showltan.tvshows.service;

import info.developia.showltan.tvshows.model.TvShow;
import info.developia.showltan.tvshows.repository.TvShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TvShowServiceImpl implements TvShowService {

    private TvShowRepository tvShowRepository;

    @Autowired
    public TvShowServiceImpl(TvShowRepository tvShowService) {
        this.tvShowRepository = tvShowService;
    }

    @Override
    public Optional<List<TvShow>> getAll() {
        return Optional.of(tvShowRepository.findAll());
    }

}
