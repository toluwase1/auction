package com.ifeoluwa;

import lombok.Data;

import java.util.Comparator;

@Data
public class Bid {
    private double maxPrice;
    private String searchItem;
    private double budget;
    private Bidder bidder;

    public Bid(double maxPrice, String searchItem, double budget, Bidder bidder) {
        this.maxPrice = maxPrice;
        this.searchItem = searchItem;
        this.budget = budget;
        this.bidder = bidder;
    }

}
