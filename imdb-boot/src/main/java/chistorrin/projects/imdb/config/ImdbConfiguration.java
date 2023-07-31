package chistorrin.projects.imdb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
    basePackages = {"chistorrin.projects.imdb.infraestructure.repository.jpa"},
    namedQueriesLocation = "classpath*:queries/**/**-jpa-named-queries.properties")
public class ImdbConfiguration {

}
