package info.developia.showltan.users.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import info.developia.showltan.users.domain.TvShow;
import info.developia.showltan.users.repository.TvShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @HystrixCommand(fallbackMethod = "getLastTvShowDefault")
    public Optional<List<TvShow>> findAllTvShows() {
//        return tvShowRepository.findAllMovies();

        List<TvShow> tvShows = new ArrayList<>();

        tvShows.add(TvShow.builder().title("Inglorious Basterds").director("Quentin Tarantino").build());
        tvShows.add(TvShow.builder().title("The Hateful Eight").director("Quentin Tarantino").build());

        return Optional.of(tvShows);
    }

    public Optional<List<TvShow>> getLastTvShowDefault() {
        List<TvShow> tvShows = new ArrayList<>();

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
