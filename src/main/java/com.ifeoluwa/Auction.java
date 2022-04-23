package com.ifeoluwa;

import java.util.*;

public class Auction {

    public static void main(String[] args) {
        Bidder bidder1 = new Bidder(1, 1, 0);
        Bidder bidder2 = new Bidder(2, 2, 0);

        Bid b1 = new Bid(12.0, "insurance", 50.0, bidder1);
        Bid b2 = new Bid(15.0, "insurance", 50.0, bidder2);

        System.out.println(rankByBid2(List.of(b1, b2)));
//        System.out.println(b1.getMaxPrice() > b2.getMaxPrice());
    }

    // b1, b2

    static Bid rankByBid2(List<Bid> bids) {
        double highestBid = 0.0;
        int index = 0;
        for (int i = 0; i < bids.size()-1; i++) {
            for (int j = i+1; j < bids.size(); j++) {
                highestBid = Math.max(bids.get(i).getMaxPrice(), bids.get(j).getMaxPrice());
                index = Math.max(i, j);
            }
        }
//        System.out.println(highestBid);
        return getIndex(highestBid, bids);
    }

    static Bid getIndex(double amount, List<Bid> bids) {
        double highestBid = 0.0;
        int index = 0;
        for (int i = 0; i < bids.size(); i++) {
           if (bids.get(i).getMaxPrice() == amount) {
               index = i;
           }
        }
        return bids.get(index);
    }

    static void rankByBid(List<Bid> bids) {
        double highestBid = Double.MAX_VALUE;
        for (int i = 0; i < bids.size(); i++) {
            if (highestBid < bids.get(i).getMaxPrice()) {
                highestBid = bids.get(i).getMaxPrice();
            }
        }
        System.out.println(highestBid);
    }
}
