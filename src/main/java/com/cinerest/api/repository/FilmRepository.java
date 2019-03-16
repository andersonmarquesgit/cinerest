package com.cinerest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinerest.api.entity.Film;

public interface FilmRepository extends JpaRepository<Film, String> {

}
