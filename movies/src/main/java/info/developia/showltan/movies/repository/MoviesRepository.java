package info.developia.showltan.movies.repository;

import info.developia.showltan.movies.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, String> {

    Optional<Set<Movies>> findByTags(Set<String> tags);

}
