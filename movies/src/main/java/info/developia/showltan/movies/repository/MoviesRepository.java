package info.developia.showltan.movies.repository;

import info.developia.showltan.movies.model.Movies;
import info.developia.showltan.movies.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, String> {

    Optional<List<Movies>> findByTags(Set<Tag> tags);
    Optional<List<Movies>> findByYear(LocalDate year);

}
