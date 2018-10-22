package info.developia.showltan.users.dto;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.domain.TvShow;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
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

    private List<Movie> movies;
    private List<TvShow> tvShows;

}
