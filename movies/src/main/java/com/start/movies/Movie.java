package com.start.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //@Entity equivalent in MongoDb
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
     private String id;
     private String imdbId;
     private String releaseDate;
     private String trailerLink;
     private String title;
     private List<String> genres;
     private String poster;
     private List<String> backdrops;
     @DocumentReference//makes collection of this attribute , and store its id's
     private List<Review> reviewIds;



}
