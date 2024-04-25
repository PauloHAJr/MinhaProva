package com.example.ApiNoticias.controller;

import com.example.ApiNoticias.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticiasController {

    Service service = new Service();

    @GetMapping("/noticias")
    public String consultarAmbos(){
        return service.consultarAmbos();
    }

    @GetMapping("/noticias/noticias")
    public String consultarNoticias(){
        return service.consultarNoticias();
    }

    @GetMapping("/noticias/releases")
    public String consultarReleases(){
        return service.consultarReleases();
    }
}
