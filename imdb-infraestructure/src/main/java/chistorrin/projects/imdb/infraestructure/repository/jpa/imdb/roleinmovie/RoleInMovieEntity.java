package chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.roleinmovie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(schema = "IMDB", name = "ROLE_IN_MOVIE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleInMovieEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -4080102195329636354L;

    @Id
    @Column(name = "ID_ROLE_IN_MOVIE")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "CHARACTER_NAME")
    private String characterName;

    @Column(name = "STARRING")
    private Boolean starring;

}
