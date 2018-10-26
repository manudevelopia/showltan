package info.developia.showltan.users.client;

import info.developia.showltan.users.dto.TvShowDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "tvshows", url = "${showltan.services.tvshows}")
public interface TvShowClient {

    @GetMapping("/all")
    List<TvShowDto> findAll();

}
