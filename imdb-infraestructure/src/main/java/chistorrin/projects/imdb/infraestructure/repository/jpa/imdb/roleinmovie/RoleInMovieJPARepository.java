package chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.roleinmovie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleInMovieJPARepository
    extends JpaRepository<RoleInMovieEntity, Integer> {

}
