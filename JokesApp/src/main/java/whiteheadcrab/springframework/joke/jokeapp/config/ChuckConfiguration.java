package whiteheadcrab.springframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// When need to change to Java Configuration from XML configuration remove this comments
//@Configuration
public class ChuckConfiguration
{
    // @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes()
        {
            return new ChuckNorrisQuotes();
        }
}
