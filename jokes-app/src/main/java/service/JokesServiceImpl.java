package service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokesServiceImpl implements JokesService {
    @Override
    public String getJokes() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
