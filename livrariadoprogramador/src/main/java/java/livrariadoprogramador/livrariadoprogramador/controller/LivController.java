package java.livrariadoprogramador.livrariadoprogramador.controller;

import java.livrariadoprogramador.livrariadoprogramador.model.dto.BookDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class LivController {
    @GetMapping
    public String formInsert(Model model){
        BookDTO book = new BookDTO();
        model.addAttribute("objBook", book);
        return "pages/register";
    }
}
