package chistorrin.projects.imdb.controller;

import chistorrin.projects.imdb.domain.entity.Movie;
import chistorrin.projects.imdb.domain.usecase.FindAllMoviesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {

	private final FindAllMoviesUseCase findAllMoviesUseCase;

	@GetMapping(value = "/movies", produces = "application/json")
	public ResponseEntity<List<Movie>> listAllMovies() {
		return new ResponseEntity<>(this.findAllMoviesUseCase.findAllMovies(),
			HttpStatus.OK);
	}

}
