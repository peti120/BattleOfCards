package com.zolipeter.cardgame.api;

import java.io.IOException;
import java.util.List;

public interface Player {

    String getName();

    void decreaseHp(int hp);

    void increaseHp(int hp);

    int getHp();

    void decreaseMp(int mp);

    void increaseMp(int mp);

    int getMp();

    FighterCard getChosenCard();

    SpellCard getChosenSpell();

    void setChosenCard(Card card);

    List<Card> getHand();

    List<Card> getDeck();

    void fillDeck(String filePath) throws IOException;

    void pickCard();

    void chooseCard(String name);

    boolean canUseSpell();




}
