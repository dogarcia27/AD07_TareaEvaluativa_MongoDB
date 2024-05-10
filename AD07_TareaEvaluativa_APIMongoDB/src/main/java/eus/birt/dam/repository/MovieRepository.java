package eus.birt.dam.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import eus.birt.dam.domain.Movie;

public interface MovieRepository extends MongoRepository<Movie, String>{
	
}
