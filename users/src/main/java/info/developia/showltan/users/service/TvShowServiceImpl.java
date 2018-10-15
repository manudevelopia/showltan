package info.developia.showltan.users.service;

import info.developia.showltan.users.domain.TvShow;
import info.developia.showltan.users.model.Tag;
import info.developia.showltan.users.repository.TvShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class TvShowServiceImpl implements TvShowService {

    private final TvShowRepository tvShowRepository;

    @Autowired
    public TvShowServiceImpl(TvShowRepository tvShowRepository) {
        this.tvShowRepository = tvShowRepository;
    }

    @Override
    public Optional<TvShow> findByTitle(String title) {
        return tvShowRepository.findByTitle(title);
    }

    @Override
    public Optional<Set<TvShow>> findByDirector(String director) {
        return tvShowRepository.findByDirector(director);
    }

    @Override
    public Optional<Set<TvShow>> findByTags(Set<Tag> tags) {
        return tvShowRepository.findByTags(tags);
    }

}
