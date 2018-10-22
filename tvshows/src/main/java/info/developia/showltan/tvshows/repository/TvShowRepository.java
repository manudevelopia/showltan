package info.developia.showltan.tvshows.repository;

import info.developia.showltan.tvshows.model.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvShowRepository extends JpaRepository<TvShow, String> {

}
