package com.avanade.AvanadeADeD.entities;

import com.avanade.AvanadeADeD.dtos.HeroDto;
import com.avanade.AvanadeADeD.interfaces.Combatant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "heroes")
@Entity(name = "Hero")
public class Hero implements Combatant {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hero_id")
    private Long id;
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

    public Hero(String aragorn, int healthPoints, int strength, int agility, int diceQuantity, DiceType diceType) {
        this.name = aragorn;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.agility = agility;
        this.diceQuantity = diceQuantity;
        this.diceType = diceType;
    }

    public Hero(HeroDto hero) {
        this.name = hero.name();
        this.healthPoints = hero.healthPoints();
        this.strength = hero.strength();
        this.agility = hero.agility();
        this.diceQuantity = hero.diceQuantity();
        this.diceType = hero.diceType();

    }

    @Override
    public void attack(java.lang.Character target) {

    }

    @Override
    public int getAttackDamage() {
        Random random = new Random();


        return strength + (diceQuantity * random.nextInt(diceType.getSizes()) + 1);
    }

}
