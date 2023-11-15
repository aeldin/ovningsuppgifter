package ovningsuppgifter.Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie {

    private final String title;

    private final String director;

    private final String[] actors;

    private List<String> reviews;

    public Movie(String title, String director, String[] actors, String review) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
        this.reviews.add(review);

    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String[] getActors() {
        return actors;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void addReview(String review) {
        reviews.add(review);

    }
}

