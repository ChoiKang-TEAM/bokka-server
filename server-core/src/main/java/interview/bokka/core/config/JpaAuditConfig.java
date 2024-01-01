package interview.bokka.core.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "interview.bokka.core.domain")
@EnableJpaRepositories(basePackages = "interview.bokka.core.domain")
@EnableJpaAuditing
public class JpaAuditConfig {
}
