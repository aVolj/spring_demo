package com.volodichev.spring_demo.service;

import com.volodichev.spring_demo.entity.Review;
import com.volodichev.spring_demo.entity.ReviewKey;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews();
    Review getReview(ReviewKey fKey);
}
