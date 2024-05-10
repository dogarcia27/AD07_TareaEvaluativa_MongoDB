package eus.birt.dam.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eus.birt.dam.domain.Movie;
import eus.birt.dam.repository.MovieRepository;

@CrossOrigin (origins= {"http://localhost:4200"})
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class MoviesController {

	
	@Autowired
	MovieRepository movieRepository;
	
	/**
	 * Endpoint principal de peliculas.
	 * @return
	 */
	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> index() {
	    try {
	        List<Movie> movies = movieRepository.findAll();
	        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<Movie>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	@GetMapping("/types")
	public ResponseEntity<List<String>> getAllTypes() {
	    try {
	        List<Movie> movies = movieRepository.findAll();
	        Set<String> uniqueTypes = new HashSet<>();
	        for (Movie movie : movies) {
	            uniqueTypes.add(movie.getType());
	        }
	        List<String> sortedTypes = new ArrayList<>(uniqueTypes);
	        Collections.sort(sortedTypes);
	        return new ResponseEntity<List<String>>(sortedTypes, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	
	@GetMapping("/genres")
	public ResponseEntity<List<String>> getAllGenres() {
	    try {
	        List<Movie> movies = movieRepository.findAll();
	        Set<String> uniqueGenres = new HashSet<>();
	        for (Movie movie : movies) {
	        	for(String genre : movie.getGenres()) {
	        		
	        		uniqueGenres.add(genre);
	        	}
	        }
	        List<String> sortedGenres = new ArrayList<>(uniqueGenres);
	        Collections.sort(sortedGenres);
	        return new ResponseEntity<List<String>>(sortedGenres, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
}