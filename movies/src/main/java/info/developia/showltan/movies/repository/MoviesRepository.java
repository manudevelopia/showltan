package info.developia.showltan.movies.repository;

import info.developia.showltan.movies.model.Movie;
import info.developia.showltan.movies.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface MoviesRepository extends JpaRepository<Movie, String> {

    Optional<List<Movie>> findByTags(Set<Tag> tags);
    Optional<List<Movie>> findByYear(LocalDate year);

}
