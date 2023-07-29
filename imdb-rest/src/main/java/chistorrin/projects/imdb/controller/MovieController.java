package chistorrin.projects.imdb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping(value = "/movies", produces = "application/json")
    public ResponseEntity<String> listAllMovies(){
        return new ResponseEntity<>("PRUEBAS", HttpStatus.OK);
    }
}
