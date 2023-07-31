package chistorrin.projects.imdb.infraestructure.repository.impl.casting;

import chistorrin.projects.imdb.domain.entity.CastingMember;
import chistorrin.projects.imdb.domain.repository.movie.CastingRepository;
import chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.movieactorroleinmovie.MovieActorRoleInMovieJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CastingRepositoryImpl implements CastingRepository {

    private final MovieActorRoleInMovieJPARepository movieActorRoleInMovieJPARepository;

    @Override
    public final List<CastingMember> getCastingMemberListByMovieId(final Long movieId) {
        return this.movieActorRoleInMovieJPARepository.
            getCastingMembersByMovie(movieId);
    }
}
