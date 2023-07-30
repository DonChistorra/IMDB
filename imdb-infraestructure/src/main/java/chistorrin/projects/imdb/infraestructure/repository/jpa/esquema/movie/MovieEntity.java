package chistorrin.projects.imdb.infraestructure.repository.jpa.esquema.movie;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(schema = "IMDB", name = "MOVIE")
public class MovieEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = 4700792942694856675L;

	@Id
	@Column(name = "ID_MOVIE", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "TITLE")
	private String title;

}
