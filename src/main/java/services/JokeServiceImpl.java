package services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

//create a service to return a jokes string from class "ChuckNorrisQuotes.getRandomQuote()"
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
        System.out.println(chuckNorrisQuotes.getRandomQuote());
    }

    @Override
    public String getJoke() {
        System.out.println("getting joke!");
        String joke = chuckNorrisQuotes.getRandomQuote();
        return joke;
    }
}
