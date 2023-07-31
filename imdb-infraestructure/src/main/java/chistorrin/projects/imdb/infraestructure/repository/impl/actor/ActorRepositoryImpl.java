package chistorrin.projects.imdb.infraestructure.repository.impl.actor;

import chistorrin.projects.imdb.domain.entity.Actor;
import chistorrin.projects.imdb.domain.repository.actor.ActorRepository;
import chistorrin.projects.imdb.infraestructure.mapper.ActorMapper;
import chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.actor.ActorEntity;
import chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.actor.ActorJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorRepositoryImpl implements ActorRepository {

    private final ActorJPARepository actorJPARepository;

    private final ActorMapper actorMapper;

    @Override
    public final List<Actor> findAllActors() {
        List<ActorEntity> responseList = this.actorJPARepository.findAll();
        return this.actorMapper.toDomainList(responseList);
    }
}
