package info.developia.showltan.users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    // id should be IMDB or similar inspired
    private String title;
    private String director;
    
}