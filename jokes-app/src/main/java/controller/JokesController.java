package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.JokesService;

@Controller
public class JokesController {
    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(path = "/jokes")
    public  String getJokes() {
        return jokesService.getJokes();
    }

}
