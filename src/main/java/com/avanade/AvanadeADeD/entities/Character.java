package com.avanade.AvanadeADeD.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Character {

    @Column(name = "name")
    private String name;
    @Column(name = "health_points")
    private int healthPoints;
    @Column(name = "strength")
    private int strength;
    @Column(name = "agility")
    private int agility;
    @Column(name = "dice_quantity")
    private int diceQuantity;
    @Column(name = "dice_type")
    @Enumerated(EnumType.STRING)
    private DiceType diceType;


    public void takeDamage(int damage) {
        healthPoints -= damage;
        if (healthPoints <= 0) {
            System.out.println(this.name + " has been defeated!");
        }
    }
}
