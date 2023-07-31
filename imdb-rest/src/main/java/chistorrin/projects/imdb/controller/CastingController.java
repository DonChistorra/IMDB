package chistorrin.projects.imdb.controller;

import chistorrin.projects.imdb.domain.entity.CastingMember;
import chistorrin.projects.imdb.domain.usecase.GetCastingByMovieIdUseCase;
import chistorrin.projects.imdb.mapper.CastingMemberRestMapper;
import chistorring.projects.imdb.api.CastingApi;
import chistorring.projects.imdb.api.model.GetCastingByMovieIdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CastingController implements CastingApi {

    private final GetCastingByMovieIdUseCase getCastingByMovieIdUseCase;

    private final CastingMemberRestMapper castingMemberRestMapper;

    @Override
    public ResponseEntity<List<GetCastingByMovieIdResponse>>
        getCastingByMovieId(final Long movieId) {
            List<CastingMember> response =
                this.getCastingByMovieIdUseCase.getCastingByMovieId(movieId);
            return new ResponseEntity<>(
                this.castingMemberRestMapper.toRestResponseList(response), HttpStatus.OK);
    }
}
