package info.developia.showltan.tvshows.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import info.developia.showltan.tvshows.model.TvShow;
import info.developia.showltan.tvshows.repository.TvShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class TvShowServiceImpl implements TvShowService {

    private TvShowRepository TvShowRepository;

    @Autowired
    public TvShowServiceImpl(TvShowRepository TvShowRepository) {
        this.TvShowRepository = TvShowRepository;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getLastTvShowDefault")
    public Optional<Set<TvShow>> getByTags(Set<String> tags) {
        return TvShowRepository.findByTags(tags);
    }

    public Optional<Set<TvShow>> getLastTvShowDefault() {
        Set<TvShow> tvShows = new HashSet<>();

        tvShows.add(TvShow.builder().title("Reservoir Dogs").director("Quentin Tarantino").build());
        tvShows.add(TvShow.builder().title("Pulp Fiction").director("Quentin Tarantino").build());
        tvShows.add(TvShow.builder().title("Jackie Brown").director("Quentin Tarantino").build());
        tvShows.add(TvShow.builder().title("Death Proof").director("Quentin Tarantino").build());
        tvShows.add(TvShow.builder().title("Django").director("Quentin Tarantino").build());
        tvShows.add(TvShow.builder().title("Inglorious Basterds").director("Quentin Tarantino").build());
        tvShows.add(TvShow.builder().title("The Hateful Eight").director("Quentin Tarantino").build());

        return Optional.of(tvShows);
    }

}
