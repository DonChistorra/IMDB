package chistorrin.projects.imdb.application.usecase;

import chistorrin.projects.imdb.domain.entity.Movie;
import chistorrin.projects.imdb.domain.repository.movie.MovieRepository;
import chistorrin.projects.imdb.domain.usecase.CreateMovieUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateMovieUseCaseImpl implements CreateMovieUseCase {

    private final MovieRepository movieRepository;

    @Override
    public final Movie createMovie(final Movie newMovie) {
        return this.movieRepository.createMovie(newMovie);
    }
}
