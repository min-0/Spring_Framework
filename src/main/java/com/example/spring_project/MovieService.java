package com.example.spring_project;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.*;

@Service
public class MovieService {

    public  List<Movie> query(final String query){

        return Arrays.asList(
                Movie.builder().title("영화1").link("http://test").build(),
                Movie.builder().title("영화2").link("http://test").build()
        );
    }
}
