package chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.movieactorroleinmovie;

import chistorrin.projects.imdb.domain.entity.CastingMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieActorRoleInMovieJPARepository
    extends JpaRepository<MovieActorRoleInMovieEntity, MovieActorRoleInMovieEntityPK> {

    @Query(name = "MovieActorRoleInMovieEntity.getCastingMembersByMovie")
    List<CastingMember> getCastingMembersByMovie(@Param("movieId") Long movieId);
}
