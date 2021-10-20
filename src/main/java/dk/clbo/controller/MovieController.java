package dk.clbo.controller;

import dk.clbo.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    MovieService service = new MovieService();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("movies", service.getAllMovies());
        return "index";
    }
}
