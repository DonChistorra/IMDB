package chistorrin.projects.imdb.mapper;

import chistorrin.projects.imdb.domain.entity.Actor;
import chistorring.projects.imdb.api.model.FindAllActorsResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ActorRestMapper {

    FindAllActorsResponse toRestResponse(Actor actor);

    List<FindAllActorsResponse> toRestResponseList(List<Actor> actorList);
}
