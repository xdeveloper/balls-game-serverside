package ua.com.abakumov.ballsgame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

@SuppressWarnings(value = "unused")
@Configuration
public class Environment {

    @Bean
    public DataSource getDataSource() {
        EmbeddedDatabase database = new EmbeddedDatabaseBuilder()
                .generateUniqueName(false)
                .setType(H2)
                .setName("balls-game-h2")
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .addScript("schema.sql")
                .build();

        return database;
    }

}
