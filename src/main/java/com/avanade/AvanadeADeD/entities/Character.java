package com.avanade.AvanadeADeD.entities;

import lombok.Getter;

@Getter
public class Character {

    private Long id;
    private String name;
    private int healthPoints;
    private int strength;
    private int agility;
    private int diceQuantity;
    private DiceType diceType;

    public void takeDamage(int damage) {
        healthPoints -= damage;
        if (healthPoints <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
}
