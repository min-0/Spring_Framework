package com.example.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/v1/search")

public class SearchController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getMoviesByQuery(@RequestParam(name = "q")String query){
        return movieService.query(query);
    }
}
