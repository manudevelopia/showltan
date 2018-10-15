package info.developia.showltan.users.dto;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.domain.TvShow;
import info.developia.showltan.users.model.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String email;
    private String name;
    private String surname;

    private Set<String> tags;

    private Set<Movie> movies;
    private Set<TvShow> tvShows;

}
