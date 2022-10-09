package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animals, boolean isPremium) {
        if (animals.equals("Cat")) {
            return (isPremium) ? "Salmon" : "Tuna";
        } else if (animals.equals("Dog")) {
            return (isPremium) ? "Boiled Chicken" : "Dog Food";
        } else {
            return (isPremium) ? "Lettuce" : "Cabbage";
        }
    }
}
