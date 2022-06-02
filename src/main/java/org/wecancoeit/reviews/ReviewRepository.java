package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review reviewOne = new Review(1L,"", "", "", "");
        Review reviewTwo = new Review(1L,"", "", "", "");
        Review reviewThree = new Review(1L,"", "", "", "");
        Review reviewFour = new Review(1L,"", "", "", "");

        reviewList.put(reviewOne.getId(), reviewOne);
        reviewList.put(reviewTwo.getId(), reviewTwo);
        reviewList.put(reviewThree.getId(), reviewThree);
        reviewList.put(reviewFour.getId(), reviewFour);


    }

    public ReviewRepository(Review ...reviewToAdd){
        for(Review review: reviewToAdd){
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll(){
        return reviewList.values();
    }
}
