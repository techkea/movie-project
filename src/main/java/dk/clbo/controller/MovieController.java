package dk.clbo.controller;

import dk.clbo.model.Dummy;
import dk.clbo.model.Movie;
import dk.clbo.repository.MovieRepository;
import dk.clbo.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Movie movie){
        System.out.println(movie.getTitle());
        return "redirect:/";
    }

}
