package mvc.configuration;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Adrian.Flak on 6/27/2017.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"mvc.models"})
@EnableJpaRepositories(basePackages = "mvc.repositories")
@EnableTransactionManagement

public class RepositoryConfiguration {

}