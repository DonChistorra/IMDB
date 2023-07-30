package chistorrin.projects.imdb.domain.usecase;

import chistorrin.projects.imdb.domain.entity.Movie;

import java.util.List;

public interface FindAllMoviesUseCase {

    List<Movie> findAllMovies();
}
