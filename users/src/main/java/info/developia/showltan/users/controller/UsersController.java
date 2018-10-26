package info.developia.showltan.users.controller;

import info.developia.showltan.users.dto.MovieDto;
import info.developia.showltan.users.dto.TvShowDto;
import info.developia.showltan.users.dto.UserDto;
import info.developia.showltan.users.model.Tag;
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

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    ResponseEntity<UserDto> getByEmail(@PathVariable String email) {
        Optional<User> user = userService.findByEmail(email);

        return user
                .map(u -> new ResponseEntity<>(fullFillUserDto(user.get()), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    private UserDto fullFillUserDto(User user) {
        UserDto userDto = UserDto.builder()
                .email(user.getEmail())
                .name(user.getName())
                .surname(user.getSurname())
                .tags(user.getTags().stream().map(Tag::getWord).collect(Collectors.toSet()))
                .build();

        Optional<List<MovieDto>> movies = movieService.findAllMovies();
        userDto.setMovieDtos(movies.orElse(Collections.emptyList()));

        Optional<List<TvShowDto>> tvShows = tvShowService.findAllTvShows();
        userDto.setTvShowDtos(tvShows.orElse(Collections.emptyList()));

        return userDto;
    }

}
