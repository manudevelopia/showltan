package info.developia.showltan.users.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import info.developia.showltan.users.dto.TvShowDto;
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
    public Optional<List<TvShowDto>> findAllTvShows() {
        return Optional.of(tvShowRepository.findAll());
    }

    public Optional<List<TvShowDto>> getLastTvShowDefault() {
        List<TvShowDto> tvShowDtos = new ArrayList<>();

        tvShowDtos.add(TvShowDto.builder().title("Reservoir Dogs").director("Quentin Tarantino").build());
        tvShowDtos.add(TvShowDto.builder().title("Pulp Fiction").director("Quentin Tarantino").build());
        tvShowDtos.add(TvShowDto.builder().title("Jackie Brown").director("Quentin Tarantino").build());
        tvShowDtos.add(TvShowDto.builder().title("Death Proof").director("Quentin Tarantino").build());
        tvShowDtos.add(TvShowDto.builder().title("Django").director("Quentin Tarantino").build());
        tvShowDtos.add(TvShowDto.builder().title("Inglorious Basterds").director("Quentin Tarantino").build());
        tvShowDtos.add(TvShowDto.builder().title("The Hateful Eight").director("Quentin Tarantino").build());

        return Optional.of(tvShowDtos);
    }

}
