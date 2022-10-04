package Udemy.Sec9.Exercise47;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }


    @Override
    public List<String> write() {
        List<String> playerItems = new ArrayList<>();
        playerItems.add(0, this.getName());
        playerItems.add(1, String.valueOf(this.getHitPoints()));
        playerItems.add(2, String.valueOf(this.getStrength()));
        playerItems.add(3, this.getWeapon());
        return playerItems;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.setName(savedValues.get(0));
            this.setHitPoints(Integer.parseInt(savedValues.get(1)));
            this.setStrength(Integer.parseInt(savedValues.get(2)));
            this.setWeapon(savedValues.get(3));
        }
    }


    @Override
    public String toString() {
        return "Player{name='" + getName() + "', hitPoints=" + getHitPoints() +
                ", strength=" + getStrength() + ", weapon='" + getWeapon() + "'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
