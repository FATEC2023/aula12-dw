package com.aula12.conn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula12.conn.model.estudante;
import com.aula12.conn.service.estudanteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class estudanteController {
private  estudanteService estudanteService;

    @Autowired
    public void SeuController(estudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @PostMapping("/cadastrar")
    public estudante criar(@RequestBody estudante e) {
        estudante et = estudanteService.save(e);
        return et;
    }

    @GetMapping("/listar")
    public List<estudante> listarEstudantes(){
        return (List<estudante>) estudanteService.findAll();
    }

    @GetMapping(value="/")
    public String teste() {
        return "Olá";
    }
    

}
