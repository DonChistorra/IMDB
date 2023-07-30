package chistorrin.projects.imdb.application.usecase;

import chistorrin.projects.imdb.domain.entity.Actor;
import chistorrin.projects.imdb.domain.repository.actor.ActorRepository;
import chistorrin.projects.imdb.domain.usecase.FindAllActorsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllActorsUseCaseImpl implements FindAllActorsUseCase {

    private final ActorRepository actorRepository;

    @Override
    public final List<Actor> findAllActors() {
        return this.actorRepository.findAllActors();
    }
}
