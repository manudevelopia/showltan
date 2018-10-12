package info.developia.showltan.users.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TvShow {

    // id should be IMDB or similar inspired
    private String title;
    private String director;

}
