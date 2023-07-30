package chistorrin.projects.imdb.infraestructure.mapper;

import chistorrin.projects.imdb.domain.entity.Actor;
import chistorrin.projects.imdb.infraestructure.repository.jpa.esquema.actor.ActorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ActorMapper {

    Actor toDomain(ActorEntity entity);

    List<Actor> toDomainList(List<ActorEntity> entityList);
}
