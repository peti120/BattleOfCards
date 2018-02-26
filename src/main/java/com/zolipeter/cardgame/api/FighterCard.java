package com.zolipeter.cardgame.api;

public class FighterCard extends Card {
    private String position;
    private int attackPoint;
    private int defensePoint;

    public FighterCard(String name,String type, String rarity, int attackPoint, int defensePoint) {
        super(name,type,rarity);
        this.attackPoint = attackPoint;
        this.defensePoint = defensePoint;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getAttackPoint() {
        return attackPoint;
    }
    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
    public int getDefensePoint() {
        return defensePoint;
    }
    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }
}
