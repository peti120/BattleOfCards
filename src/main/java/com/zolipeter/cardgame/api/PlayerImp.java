package com.zolipeter.cardgame.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerImp implements Player{
    private String name;
    private String deckPath;
    private int hp;
    private int mp;
    private List<Card> deck;
    private List<Card> hand;
    private FighterCard chosenCard;
    private SpellCard chosenSpell;



    public PlayerImp(String name,String deckPath) throws IOException {
        this.name = name;
        this.deckPath = deckPath;
        hp = 10000;
        mp = 10;
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        chosenCard = null;
        chosenSpell = null;
        fillDeck(deckPath);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void decreaseHp(int hp) {
        this.hp -= hp;
    }

    @Override
    public void increaseHp(int hp) {
        this.hp += hp;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void decreaseMp(int mp) {
        this.mp -= mp;
    }

    @Override
    public void increaseMp(int mp) {
        this.mp += mp;
    }

    @Override
    public int getMp() {
        return mp;
    }

    @Override
    public FighterCard getChosenCard() {
        return chosenCard;
    }

    @Override
    public SpellCard getChosenSpell(){
        return chosenSpell;
    }

    @Override
    public void setChosenCard(Card card) {
        if (card.getType().equals("fighter")) {
            this.chosenCard = (FighterCard) card;
        }
        else {
            this.chosenSpell = (SpellCard) card;
        }
    }

    @Override
    public List<Card> getHand() {
        return hand;
    }

    @Override
    public List<Card> getDeck() {
        return deck;
    }

    @Override
    public void fillDeck(String filePath) throws IOException {
        CSVParser csvParser = new CSVParser();
        deck = csvParser.getCardsFromCsv(deckPath);
        Collections.shuffle(deck);
    }

    @Override
    public void pickCard() {
        hand.add(deck.get(0));
        deck.remove(deck.get(0));
    }

    @Override
    public void chooseCard(String name) {
        for (Card card : hand) {
            if (card instanceof FighterCard) {
                if (card.getName().toLowerCase().equals(name.toLowerCase())) {
                    setChosenCard(card);
                }
            }
            else {
                if (card.getName().toLowerCase().equals(name.toLowerCase())) {
                    setChosenCard(card);
                }

            }
        }
    }

    @Override
    public boolean canUseSpell() {
        for (Card card : hand) {
            if (card instanceof SpellCard) {
                if (mp > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
