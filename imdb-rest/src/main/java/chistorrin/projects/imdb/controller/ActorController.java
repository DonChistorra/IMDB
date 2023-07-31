package chistorrin.projects.imdb.controller;

import chistorrin.projects.imdb.domain.usecase.FindAllActorsUseCase;
import chistorrin.projects.imdb.mapper.ActorRestMapper;
import chistorring.projects.imdb.api.ActorsApi;
import chistorring.projects.imdb.api.model.ActorRestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ActorController implements ActorsApi {

    private final FindAllActorsUseCase findAllActorsUseCase;

    private final ActorRestMapper actorRestMapper;

    @Override
    public ResponseEntity<List<ActorRestDTO>> findAllActors() {
        return new ResponseEntity<>(
            this.actorRestMapper.toRestResponseList(
                this.findAllActorsUseCase.findAllActors()),
        HttpStatus.OK);
    }
}
