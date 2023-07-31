package chistorrin.projects.imdb.mapper;

import chistorrin.projects.imdb.domain.entity.CastingMember;
import chistorring.projects.imdb.api.model.GetCastingByMovieIdResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CastingMemberRestMapper {

    GetCastingByMovieIdResponse toRestResponse(CastingMember domain);

    List<GetCastingByMovieIdResponse> toRestResponseList(List<CastingMember> domainList);
}
