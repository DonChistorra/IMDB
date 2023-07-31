package chistorrin.projects.imdb.mapper;

import chistorrin.projects.imdb.domain.entity.Actor;
import chistorring.projects.imdb.api.model.ActorRestDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ActorRestMapper {

    ActorRestDTO toRestResponse(Actor actor);

    List<ActorRestDTO> toRestResponseList(List<Actor> actorList);
}
