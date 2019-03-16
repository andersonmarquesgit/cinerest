package com.cinerest.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinerest.api.entity.Film;
import com.cinerest.api.repository.FilmRepository;
import com.cinerest.api.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmRepository filmRepository;
	
	@Override
	public List<Film> getFilms() {
		return filmRepository.findAll();
	}

}
