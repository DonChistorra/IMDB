package chistorrin.projects.imdb.domain.usecase;

import chistorrin.projects.imdb.domain.entity.Actor;

import java.util.List;

public interface FindAllActorsUseCase {

    List<Actor> findAllActors();
}
