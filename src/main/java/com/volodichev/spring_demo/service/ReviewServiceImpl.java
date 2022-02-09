package com.volodichev.spring_demo.service;

import com.volodichev.spring_demo.entity.Review;
import com.volodichev.spring_demo.entity.ReviewKey;
import com.volodichev.spring_demo.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepo reviewRepo;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    @Override
    public Review getReview(ReviewKey fKey) {
        Optional<Review> reviewResult = reviewRepo.findById(fKey);
        return reviewResult.orElse(null);
    }

    @Override
    public Review addReview(Review review) {
        return reviewRepo.save(review);
    }

    @Override
    public String deleteReview(ReviewKey key) {
        reviewRepo.deleteById(key);
        return "Delete complete for review username = " + key.getUsername() + "and id review " + key.getFilmId();
    }
}
