package chistorrin.projects.imdb.mapper;

import chistorrin.projects.imdb.domain.entity.Movie;
import chistorring.projects.imdb.api.model.FindAllMoviesResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MovieRestMapper {

    FindAllMoviesResponse toRestResponse(Movie movie);

    List<FindAllMoviesResponse> toRestResponseList(List<Movie> movieList);
}
