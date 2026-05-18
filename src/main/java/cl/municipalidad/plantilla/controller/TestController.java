package cl.municipalidad.plantilla.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/public/test")
    public String rutaPublica() {
        return "Exito, Entraste a la zona publica sin token.";
    }

    @GetMapping("/api/privado/test")
    public String rutaPrivada()  {
        return "You shall not pass, pero igual lo hiciste, no toques nada 🗿";
    }
}
