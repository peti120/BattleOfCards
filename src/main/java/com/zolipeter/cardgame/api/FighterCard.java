package com.zolipeter.cardgame.api;

public class FighterCard extends Card {
    private String position;
    private int attackPoint;
    private int defensePoint;

    public FighterCard(String name) {
        super(name);
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
