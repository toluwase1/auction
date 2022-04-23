package com.ifeoluwa;

//sponsored search auction

import lombok.Data;
import java.util.Set;

@Data
public class Bidder {
//    private Set<Bid> bids;
    private int id;
    private int weight;
    private int score;

    public Bidder(int id, int weight, int score) {
        this.id = id;
        this.weight = weight;
        this.score = score;
    }
}