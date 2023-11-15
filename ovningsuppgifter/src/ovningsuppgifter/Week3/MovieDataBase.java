package ovningsuppgifter.Week3;

import java.util.List;

public class MovieDataBase {
    public static void main(String[] args) {


        String title = "Star Wars";
        String director = "George Lucas";
        String[] actors = {"Mark Hamill", "Harrison Ford", "Carrie Fisher"};
        String review = "This movie sucks balls";

        Movie movie = new Movie(title, director, actors, review);

        movie.addReview("I like this movie");
        movie.addReview("Lightsabers woooo");

        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: ");
        for (String actor : movie.getActors()) {
            System.out.println("- " + actor);
        }



        List<String> allReviews = movie.getReviews();
        for (String reviews : allReviews) {
            System.out.println("Review: " + reviews);


        }
    }
}
