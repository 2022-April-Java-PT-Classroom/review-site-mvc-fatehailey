package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String imgUrl;
    private String reviewCategory;
    private String content;
    private String description;
    private String artist;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }

    public String getDescription() {
        return description;
    }

    public String getArtist() {
        return artist;
    }

    public Review(Long id, String title, String imgUrl, String reviewCategory, String content, String description, String artist) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
        this.reviewCategory = reviewCategory;
        this.content = content;
        this.description = description;
        this.artist = artist;
    }
}
