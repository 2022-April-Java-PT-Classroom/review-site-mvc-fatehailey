package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review reviewOne = new Review(1L,"Dangerous: The Double Album", "/images/71szkhEjZKL._SL1200_.jpg", "Country", "Sand in My Boots, Wasted on You, Somebody's Problem, More Surprised Than Me, 865, Warning, Neon Eyes, Outlaw, Whiskey'd My Way, Wonderin' Bout the Wind, Your Bartender, Only Thing That's Gone, Cover Me Up, 7 Summers, More Than My Hometown, Still Goin Down, Rednecks, Red Letters, Dangerous, Beer Don't, Blame It on Me, Somethin' Country, This Bar, Country A$$ Shit, Whatcha Think of Country, Me on Whiskey, Need a Boat, Silverado for Sale, Heartless, Livin' the Dream, Quittin' Time", "Spoke to multiple phases of life and have multiple different sounds based on influences.", "Morgan Wallen");
        Review reviewTwo = new Review(2L,"2014 Forest Hills Drive", "/images/0*pnTPMu3UkwDUbd5r.jpg", "Hip-Hop/Rap", "Intro, January 28th, 03' Adolescence, A Tale of 2 Citiez, Fire Squad, St. Tropez, G.O.M.D>, Hello, Note to Self, 03'No Role Modelz, Apparently, Love Yourz", "Named after the address of his childhood home that he brought back from foreclosure", "J. Cole");
        Review reviewThree = new Review(3L,"Californication", "/images/RedHotChiliPeppersCalifornication.jpg", "Alternative", "Around the World, Scar Tissue, Paallrl Universe, Get On Top, Californication, Easily, Porcelain, Emit Remmus, This Velvet Glove, Savior, Purple Stain, Right On Time, Road Trippin' Otherside, I Like Dirt", "Tell tales of wondering souls who've lost their way searching for American dream in California", "Red Hot Chili Peppers");
        Review reviewFour = new Review(4L,"Back in Black", "/images/41kj36cVMFL._SX425_.jpg", "Rock", "Hells Bells, Shoot to Thrill, What Do You Do For Money Honey, Giving The Dog A Bone, Let Me Put My Love into You, Shake A Leg, Back in Black, You Shook Me All Night, Have A Drink On Me, Rock and Roll ain't Noise Pollution", "A tribute album", "AC/DC");

        reviewList.put(reviewOne.getId(), reviewOne);
        reviewList.put(reviewTwo.getId(), reviewTwo);
        reviewList.put(reviewThree.getId(), reviewThree);
        reviewList.put(reviewFour.getId(), reviewFour);


    }

    public ReviewRepository(Review ...reviewsToAdd){
        for(Review review : reviewsToAdd){
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
