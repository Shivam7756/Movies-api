package com.start.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping("/get")
    public ResponseEntity<List<Movie>> getallMovies()
    {
      return new ResponseEntity<List<Movie>>(movieService.allshhio[Movie(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")//pathVariable is similar to request.getParameter
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable("imdbId") String imdbId)
    {
         return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId),HttpStatus.OK);
    }
}
