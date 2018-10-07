package info.developia.showltan.movies.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @GetMapping("/all")
    ResponseEntity<Set<String>> getAll() {
        Set<String> movies = new HashSet<>();

        movies.add("Reservoir Dogs");
        movies.add("Pulp Fiction");
        movies.add("Jackie Brown");
        movies.add("Death Proof");
        movies.add("Django");
        movies.add("Inglorious Basterds");
        movies.add("The Hateful Eight");

        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

}