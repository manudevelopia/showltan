package info.developia.showltan.movies.controller;

import info.developia.showltan.movies.model.Movies;
import info.developia.showltan.movies.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping("/all")
    ResponseEntity<Set<Movies>> getAll() {
        return moviesService.getLast()
                .map(m -> new ResponseEntity<>(m, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

}