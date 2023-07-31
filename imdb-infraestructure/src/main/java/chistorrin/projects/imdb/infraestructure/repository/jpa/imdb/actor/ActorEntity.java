package chistorrin.projects.imdb.infraestructure.repository.jpa.imdb.actor;

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
import java.time.LocalDate;

@Entity
@Table(schema = "IMDB", name = "ACTOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActorEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 357495285743044741L;

    @Id
    @Column(name = "ID_ACTOR", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;


}
