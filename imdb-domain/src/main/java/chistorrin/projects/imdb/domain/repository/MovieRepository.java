package chistorrin.projects.imdb.domain.repository;

import chistorrin.projects.imdb.domain.entity.Movie;

import java.util.List;

public interface MovieRepository {

    List<Movie> findAllMovies();
}
