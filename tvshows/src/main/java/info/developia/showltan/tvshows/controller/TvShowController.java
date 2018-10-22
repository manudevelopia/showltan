package info.developia.showltan.tvshows.controller;

import info.developia.showltan.tvshows.model.TvShow;
import info.developia.showltan.tvshows.service.TvShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tvshows")
public class TvShowController {

    private final TvShowService TvShowervice;

    @Autowired
    public TvShowController(TvShowService TvShowService) {
        this.TvShowervice = TvShowService;
    }

    @GetMapping("/all")
    ResponseEntity<List<TvShow>> getAll() {
        return TvShowervice.getAll()
                .map(m -> new ResponseEntity<>(m, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

}