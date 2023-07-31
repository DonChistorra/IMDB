package chistorrin.projects.imdb.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CastingMember {

    private String actorFullName;

    private String role;
}
