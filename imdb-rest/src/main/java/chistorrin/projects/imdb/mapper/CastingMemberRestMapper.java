package chistorrin.projects.imdb.mapper;

import chistorrin.projects.imdb.domain.entity.CastingMember;
import chistorring.projects.imdb.api.model.CastingRestDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CastingMemberRestMapper {

    CastingRestDTO toRestResponse(CastingMember domain);

    List<CastingRestDTO> toRestResponseList(List<CastingMember> domainList);
}
