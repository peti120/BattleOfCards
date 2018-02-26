package com.zolipeter.cardgame.api;

public abstract class Card {
    private String name;
    private String rarity;
    private String type;

    public Card(String name,String type,String rarity) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public String getType() {
        return type;
    }
}
