package chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.movieactorroleinmovie;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MovieActorRoleInMovieEntityPK implements Serializable {

    @Serial
    private static final long serialVersionUID = 9042503749075285071L;

    @Column(name = "ID_MOVIE", nullable = false)
    private Long movieId;

    @Column(name = "ID_ACTOR", nullable = false)
    private Long actorId;

    @Column(name = "ID_ROLE_IN_MOVIE", nullable = false)
    private Long roleInMovieId;

}
