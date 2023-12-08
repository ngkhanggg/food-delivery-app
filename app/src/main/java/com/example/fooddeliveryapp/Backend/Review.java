package com.example.fooddeliveryapp.Backend;

public class Review {
    private int id;
    private int rating;
    private String comment;
    private User from;

    public Review() {}

    public Review(int id, int rating, String comment, User from) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.from = from;
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public User getFrom() {
        return from;
    }
}
