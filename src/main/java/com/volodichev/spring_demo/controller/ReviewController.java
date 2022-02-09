package com.volodichev.spring_demo.controller;

import com.volodichev.spring_demo.entity.Film;
import com.volodichev.spring_demo.entity.Review;
import com.volodichev.spring_demo.entity.ReviewKey;
import com.volodichev.spring_demo.entity.User;
import com.volodichev.spring_demo.service.FilmService;
import com.volodichev.spring_demo.service.ReviewService;
import com.volodichev.spring_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @GetMapping(value = "reviews")
    public List<Review> getAllFilms() {
        return reviewService.getAllReviews();
    }

    @GetMapping(value = "reviews/{username}/{idReview}")
    public Review getReview(@PathVariable String username, @PathVariable long idReview) {
        return reviewService.getReview(new ReviewKey(username, idReview));
    }

    @PostMapping(value = "reviews")
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @PutMapping(value = "reviews")
    public Review updateEmployee(@RequestBody Review review){
        return reviewService.addReview(review);
    }


}
