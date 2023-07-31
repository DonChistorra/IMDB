package chistorrin.projects.imdb.domain.repository.movie;

import chistorrin.projects.imdb.domain.entity.CastingMember;

import java.util.List;

public interface CastingRepository {

    List<CastingMember> getCastingMemberListByMovieId(Long movieId);
}
