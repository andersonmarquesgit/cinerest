package com.cinerest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinerest.api.entity.Film;
import com.cinerest.api.service.FilmService;

@RestController
@RequestMapping("/api/films")
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	@GetMapping
	public List<Film> getFilms() {
        return filmService.getFilms();
    }
}
