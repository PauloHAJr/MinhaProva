package com.example.ApiNoticias.service;

import com.example.ApiNoticias.repository.Repository;
import com.example.ApiNoticias.model.Entity;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    private String consultarURL(String apiUrl) {
        String dados = "";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }

    public String consultarAmbos(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/");
    }

    public String consultarNoticias(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia");
    }

    public String consultarReleases(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release");
    }

    public Entity inserirNoticias(Entity noticias) {
        return repository.save(noticias);
    }

    public Entity inserirReleases(Entity releases) {
        return repository.save(releases);
    }
}
