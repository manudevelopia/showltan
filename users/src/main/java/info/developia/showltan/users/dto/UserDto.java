package info.developia.showltan.users.dto;

import info.developia.showltan.users.domain.Movie;
import info.developia.showltan.users.domain.TvShow;
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
    private String surnameFirst;
    private String surnameSecond;

    private Set<Movie> movies;
    private Set<TvShow> tvShows;

}
