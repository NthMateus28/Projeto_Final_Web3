package java.livrariadoprogramador.livrariadoprogramador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.livrariadoprogramador.livrariadoprogramador.model.dto.BookDTO;
import java.livrariadoprogramador.livrariadoprogramador.Service.LivService;
import java.livrariadoprogramador.livrariadoprogramador.util.LivMapping;

@Controller
@RequestMapping("/books")
public class APILivControler {
    @Autowired
    private LivService bookService;

    @GetMapping
    public String formInsert(Model model) {
        BookDTO book = new BookDTO();
        model.addAttribute("objBook", book);
        return "pages/register";
    }

    @PostMapping
    public String insert(@ModelAttribute BookDTO bookDTO) {
        var book = bookService.insertOrUpdate(
                LivMapping.toBook(bookDTO));
        if (book.getId() != 0) {
            return "pages/success";
        } else {
            return "pages/error";
        }
    }
}