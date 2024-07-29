package com.springapp.Controlador;

import com.springapp.Entidad.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class LibroControlador {
//inyeccion de depencias por campo
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/libros")
    public String listarLibros(Model model) {
        List<Libro>libros =restTemplate.getForObject("http://localhost:8080/api/libros",List.class);
        model.addAttribute("libros",libros);
                return "/Libro/mostarlibros";
    }
}
