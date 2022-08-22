package app.configurations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("app.domain.repositories")
@EntityScan("app.domain.models")
public class RepositoryConfiguration {
}
