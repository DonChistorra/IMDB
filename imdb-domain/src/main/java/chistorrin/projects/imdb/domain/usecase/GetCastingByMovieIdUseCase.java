package chistorrin.projects.imdb.domain.usecase;

import chistorrin.projects.imdb.domain.entity.CastingMember;

import java.util.List;

public interface GetCastingByMovieIdUseCase {

    List<CastingMember> getCastingByMovieId(Long movieId);

}
