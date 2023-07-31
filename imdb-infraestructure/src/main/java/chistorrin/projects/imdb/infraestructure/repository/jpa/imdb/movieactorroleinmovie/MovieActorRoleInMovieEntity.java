package chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.movieactorroleinmovie;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(schema = "IMDB", name = "MOVIE_ACTOR_ROLE_IN_MOVIE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieActorRoleInMovieEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -6691421320736221806L;

    @EmbeddedId
    private MovieActorRoleInMovieEntityPK pk;

}
