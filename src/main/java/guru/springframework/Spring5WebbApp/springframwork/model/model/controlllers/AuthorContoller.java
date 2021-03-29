package guru.springframework.Spring5WebbApp.springframwork.model.model.controlllers;

import guru.springframework.Spring5WebbApp.springframwork.model.model.repositories.AutorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorContoller {
    private AutorRepository autorRepository;

    public AuthorContoller(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }
@RequestMapping("/autors")
    public String getAuthor(Model model){

        model.addAttribute("authors",autorRepository.findAll());
        return "authors";

    }


}
