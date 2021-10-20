package dk.clbo.services;

import dk.clbo.model.Movie;
import dk.clbo.repository.MovieRepository;

import java.util.List;

public class MovieService {

    MovieRepository repository;

    public MovieService() {
        repository = new MovieRepository();
    }

    public List<Movie> getAllMovies(){
        return repository.getAllMovies();
    }

}
