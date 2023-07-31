package chistorrin.projects.imdb.mapper;

import chistorrin.projects.imdb.domain.entity.Movie;
import chistorring.projects.imdb.api.model.MovieRestDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MovieRestMapper {

    MovieRestDTO toRestResponse(Movie movie);

    List<MovieRestDTO> toRestResponseList(List<Movie> movieList);
}
