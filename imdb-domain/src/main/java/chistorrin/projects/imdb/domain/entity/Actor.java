package chistorrin.projects.imdb.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Actor {

    private Integer id;

    private String lastName;

    private String firstName;

    private LocalDate dateOfBirth;
}
