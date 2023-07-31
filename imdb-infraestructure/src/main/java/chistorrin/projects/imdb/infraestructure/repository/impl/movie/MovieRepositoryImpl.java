package chistorrin.projects.imdb.infraestructure.repository.impl.movie;

import chistorrin.projects.imdb.domain.entity.Movie;
import chistorrin.projects.imdb.domain.repository.movie.MovieRepository;
import chistorrin.projects.imdb.infraestructure.mapper.MovieMapper;
import chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.movie.MovieEntity;
import chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.movie.MovieJPARepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRepositoryImpl implements MovieRepository {

    private final MovieJPARepository movieJPARepository;

    private final MovieMapper movieMapper;

    public MovieRepositoryImpl(final MovieJPARepository movieJPARepository,
        final MovieMapper movieMapper) {
        this.movieJPARepository = movieJPARepository;
        this.movieMapper = movieMapper;
    }

    @Override
    public final List<Movie> findAllMovies() {
        List<MovieEntity> resultList = this.movieJPARepository.findAll();
        return this.movieMapper.toDomainList(resultList);
    }
}
