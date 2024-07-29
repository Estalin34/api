package com.springapp.Controlador;

import com.springapp.Entidad.Autor;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutorControlador {

    @GetMapping("/autores")
    public String formularioAutor(Model model) {
        model.addAttribute("autor", new Autor());
        return "/Autor/formulario";
    }

    @PostMapping("/registrarAutor")
    public String registrarAutor(@Valid @ModelAttribute Autor autor, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/Autor/formulario";
        }else{
            return "/Autor/registro_exitoso";
        }
    }
}

