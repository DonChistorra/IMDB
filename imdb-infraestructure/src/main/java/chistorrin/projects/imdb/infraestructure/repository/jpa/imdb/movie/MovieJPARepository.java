package chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieJPARepository extends JpaRepository<MovieEntity, Long> {

}
