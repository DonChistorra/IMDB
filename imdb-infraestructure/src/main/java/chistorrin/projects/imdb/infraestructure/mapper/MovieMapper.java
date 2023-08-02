package chistorrin.projects.imdb.infraestructure.mapper;

import chistorrin.projects.imdb.domain.entity.Movie;
import chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.movie.MovieEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", suppressTimestampInGenerated = true)
public interface MovieMapper {

    Movie toDomain(MovieEntity entity);

    List<Movie> toDomainList(List<MovieEntity> entityList);

    MovieEntity toEntity(Movie domain);

    List<MovieEntity> toEntityList(List<Movie> domainList);
}
