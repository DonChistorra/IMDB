package chistorrin.projects.imdb.domain.usecase;

import chistorrin.projects.imdb.domain.entity.Movie;

public interface CreateMovieUseCase {

    Movie createMovie(Movie newMovie);
}
