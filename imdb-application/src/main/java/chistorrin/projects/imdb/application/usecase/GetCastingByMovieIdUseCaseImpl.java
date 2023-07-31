package chistorrin.projects.imdb.application.usecase;

import chistorrin.projects.imdb.domain.entity.CastingMember;
import chistorrin.projects.imdb.domain.repository.movie.CastingRepository;
import chistorrin.projects.imdb.domain.usecase.GetCastingByMovieIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetCastingByMovieIdUseCaseImpl implements GetCastingByMovieIdUseCase {

    private final CastingRepository castingRepository;

    @Override
    public final List<CastingMember> getCastingByMovieId(final Long movieId) {
        return this.castingRepository.getCastingMemberListByMovieId(movieId);
    }
}
