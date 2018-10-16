package info.developia.showltan.tvshows.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TvShow {

    @Id
    private String title;
    private String director;
    private LocalDate year;

    @ManyToMany
    private Set<Tag> tags;

}

// Result from http://imdbapi.net/

//{
//    "imdb_id": "tt0944947"
//    "title": "Game of Thrones"
//    "year": "2017"
//    "rated": "TV-MA"
//    "released": "17 April 2011 (USA)"
//    "runtime": "56 min"
//    "genre": "Adventure, Drama, Fantasy"
//    "director": ""
//    "writers": "David Benioff , D.B. Weiss"
//    "actors": "Emilia Clarke , Peter Dinklage , Kit Harington"
//    "plot": "In the mythical continent of Westeros, several powerful families fight for control of the Seven Kingdoms. As conflict erupts in the kingdoms of men, an ancient enemy rises once again to threaten them all. Meanwhile, the last heirs of a recently usurped dynasty plot to take back their homeland from across the Narrow Sea."
//    "country": "USA, UK"
//    "language": "English"
//    "metascore": "0"
//    "poster": "https://images-na.ssl-images-amazon.com/images/M/MV5BMjE3NTQ1NDg1Ml5BMl5BanBnXkFtZTgwNzY2NDA0MjI@._V1_UX182_CR0,0,182,268_AL_.jpg"
//    "rating": "9.5"
//    "votes": "1,161,958"
//    "budget": "N/A"
//    "opening_weekend": "N/A"
//    "gross": "N/A"
//    "production": "Home Box Office (HBO), Television 360, Grok! Studio"
//    "type": "series"
//    "status": "true"
//}