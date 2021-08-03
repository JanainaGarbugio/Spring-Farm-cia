package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Categoria;
import com.example.demo.Repositoy.CategoriaRepository;

@RestController
@RequestMapping ("/categoria") // A requisição categoria consome essa classe 
@CrossOrigin ("*") // Aceita requisições de qualquer origem 
public class CategoriaController {

	@Autowired 
	private CategoriaRepository repository;

	@GetMapping
    public ResponseEntity<List<Categoria>> GetAll(){
    	return ResponseEntity.ok(repository.findAll());
    }
}
