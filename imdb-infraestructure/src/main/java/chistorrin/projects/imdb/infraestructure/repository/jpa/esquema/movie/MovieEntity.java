package chistorrin.projects.imdb.infraestructure.repository.jpa.esquema.movie;



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
@Table(schema = "IMDB", name = "MOVIES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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


