package com.zolipeter.cardgame.api;

public class SpellCard extends Card {
    private String effect;
    private int effectValue;
    public SpellCard(String name, String type, String rarity,String effect,int effectValue) {
        super(name, type, rarity);
        this.effect = effect;
        this.effectValue = effectValue;

    }

    public String getEffect() {
        return effect;
    }
    public int getEffectValue() {
        return effectValue;
    }

    private String generateDescription(){
        String desc = "";
        if(!effect.equals("Revive")){
            desc = getEffect()+" by: "+getEffectValue();
        }
        else{
            desc = "Revive a dead fighter";
        }
        return desc;
    }

}
