package com.volodichev.spring_demo.repository;

import com.volodichev.spring_demo.entity.Review;
import com.volodichev.spring_demo.entity.ReviewKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review, ReviewKey> {

}
