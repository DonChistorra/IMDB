package chistorrin.projects.imdb.controller;

import chistorrin.projects.imdb.domain.usecase.FindAllMoviesUseCase;
import chistorrin.projects.imdb.mapper.MovieRestMapper;
import chistorring.projects.imdb.api.MoviesApi;
import chistorring.projects.imdb.api.model.MovieRestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController implements MoviesApi {

	private final FindAllMoviesUseCase findAllMoviesUseCase;

	private final MovieRestMapper movieRestMapper;

	@Override
	public ResponseEntity<List<MovieRestDTO>> findAllMovies() {
		return new ResponseEntity<>(
			this.movieRestMapper.toRestResponseList(
				this.findAllMoviesUseCase.findAllMovies()),
			HttpStatus.OK);
	}

}
