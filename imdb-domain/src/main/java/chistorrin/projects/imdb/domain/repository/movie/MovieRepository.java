package chistorrin.projects.imdb.domain.repository.movie;

import chistorrin.projects.imdb.domain.entity.Movie;

import java.util.List;

public interface MovieRepository {

    List<Movie> findAllMovies();

    Movie createMovie(Movie newMovie);
}
