package dk.clbo.controller;

import dk.clbo.model.Dummy;
import dk.clbo.repository.MovieRepository;
import dk.clbo.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    private MovieRepository repo;

    public MovieController(){
        repo = new MovieRepository();
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("movies", repo.getAllMovies());
        return "index";
    }
}
