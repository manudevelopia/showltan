package info.developia.showltan.users.controller;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.domain.TvShow;
import info.developia.showltan.users.model.User;
import info.developia.showltan.users.service.MovieService;
import info.developia.showltan.users.service.TvShowService;
import info.developia.showltan.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;
    private final MovieService movieService;
    private final TvShowService tvShowService;

    @Autowired
    public UsersController(UserService userService, MovieService movieService, TvShowService tvShowService) {
        this.userService = userService;
        this.movieService = movieService;
        this.tvShowService = tvShowService;
    }

    @GetMapping("/{email}")
    ResponseEntity<User> getByEmail(@PathVariable("email") String email){
        Optional<User> user = userService.findByEmail(email);

        return user
                .map(u -> new ResponseEntity<>(fullFillUser(user.get()), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    private User fullFillUser(User user) {
        Optional<Set<Movie>> movies = movieService.findByDirector("");

        Optional<Set<TvShow>> tvShows = tvShowService.findByDirector("");

        return user;
    }

}
