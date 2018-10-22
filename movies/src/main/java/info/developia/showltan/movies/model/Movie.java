package info.developia.showltan.movies.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String director;
    private LocalDate year;

}

// Result from http://imdbapi.net/

//{
//    "imdb_id": "tt0110912"
//    "title": "Pulp Fiction"
//    "year": "1994"
//    "rated": "R"
//    "released": "14 October 1994 (USA)"
//    "runtime": "154 min"
//    "genre": "Crime, Drama"
//    "director": "Quentin Tarantino"
//    "writers": "Quentin Tarantino  (stories), Roger Avary  (stories)"
//    "actors": "John Travolta , Uma Thurman , Samuel L. Jackson"
//    "plot": "Jules Winnfield (Samuel L. Jackson) and Vincent Vega (John Travolta) are two hit men who are out to retrieve a suitcase stolen from their employer, mob boss Marsellus Wallace (Ving Rhames). Wallace has also asked Vincent to take his wife Mia (Uma Thurman) out a few days later when Wallace himself will be out of town. Butch Coolidge (Bruce Willis) is an aging boxer who is paid by Wallace to lose his fight. The lives of these seemingly unrelated people are woven together comprising of a series of funny, bizarre and uncalled-for incidents."
//    "country": "USA"
//    "language": "English, Spanish, French"
//    "metascore": "94"
//    "poster": "https://images-na.ssl-images-amazon.com/images/M/MV5BMTkxMTA5OTAzMl5BMl5BanBnXkFtZTgwNjA5MDc3NjE@._V1_UX182_CR0,0,182,268_AL_.jpg"
//    "rating": "8.9"
//    "votes": "1,423,039"
//    "budget": "$8,000,000"
//    "opening_weekend": "4,243,233                (UK)"
//    "gross": "$107,930,000"
//    "production": "Miramax, A Band Apart, Jersey Films"
//    "type": "movie"
//    "status": "true"
//}