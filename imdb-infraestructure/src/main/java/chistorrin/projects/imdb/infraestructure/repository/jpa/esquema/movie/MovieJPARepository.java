package chistorrin.projects.imdb.infraestructure.repository.jpa.esquema.movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieJPARepository extends JpaRepository<MovieEntity, Long> {

}
