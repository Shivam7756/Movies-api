package com.start.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

//equivalent to dao layer in normal database projects
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

   Optional<Movie> findMoviesByImdbId(String imdbId);
}
