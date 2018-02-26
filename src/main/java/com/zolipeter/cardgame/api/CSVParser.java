package com.zolipeter.cardgame.api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    private List<Card> deck = new ArrayList<>();

    public List<Card> getCardsFromCsv(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            String[] card = line.split(",");
            if (card[1].equals("Fighter")) {
                FighterCard fighterCard = new FighterCard(card[0],card[1],card[2],Integer.parseInt(card[3]),Integer.parseInt(card[4]));
                deck.add(fighterCard);
            } else {
                SpellCard spellCard = new SpellCard(card[0],card[1],card[2],card[3],Integer.parseInt(card[4]));
            }
        }
        return deck;
    }
}
