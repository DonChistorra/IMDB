package chistorrin.projects.imdb.application;

import chistorrin.projects.imdb.domain.entity.Movie;
import chistorrin.projects.imdb.domain.repository.MovieRepository;
import chistorrin.projects.imdb.domain.usecase.FindAllMoviesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllMoviesUseCaseImpl implements FindAllMoviesUseCase {

    private final MovieRepository movieRepository;

    @Override
    public final List<Movie> findAllMovies() {
        return this.movieRepository.findAllMovies();
    }
}
