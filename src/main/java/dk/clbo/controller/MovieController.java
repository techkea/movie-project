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
    private String name;
    private Dummy du;

    public MovieController(){
        repo = new MovieRepository();
        name = "Claus";
    }

    @GetMapping("/")
    public String index(Model model){

        System.out.println(repo.getAllMovies());

        model.addAttribute("movies", repo.getAllMovies());
        model.addAttribute("xxx", this.name);
        model.addAttribute("dumm", du.getName());
        return "index";
    }
}
