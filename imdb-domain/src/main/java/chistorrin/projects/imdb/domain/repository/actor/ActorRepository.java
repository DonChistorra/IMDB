package chistorrin.projects.imdb.domain.repository.actor;


import chistorrin.projects.imdb.domain.entity.Actor;

import java.util.List;

public interface ActorRepository {

    List<Actor> findAllActors();
}
