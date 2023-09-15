package com.avanade.AvanadeADeD.entities;

import com.avanade.AvanadeADeD.dtos.CharacterDto;
import com.avanade.AvanadeADeD.dtos.CharacterUpdateDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "characters")
@Entity(name = "Character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "health_points")
    private int healthPoints;
    @Column(name = "strength")
    private int strength;
    @Column(name = "defence")
    private int defence;
    @Column(name = "agility")
    private int agility;
    @Column(name = "dice_quantity")
    private int diceQuantity;
    @Column(name = "dice_type")
    @Enumerated(EnumType.STRING)
    private DiceType diceType;
    @Column(name = "faction")
    @Enumerated(EnumType.STRING)
    private Faction faction;

    public Character(CharacterDto character) {
        this.name = character.name();
        this.healthPoints = character.healthPoints();
        this.strength = character.strength();
        this.defence = character.defence();
        this.agility = character.agility();
        this.diceQuantity = character.diceQuantity();
        this.diceType = character.diceType();
        this.faction = character.faction();
    }


    public void takeDamage(int damage) {
        healthPoints -= damage;
        if (healthPoints <= 0) {
            System.out.println(this.name + " has been defeated!");
        }
    }

    public void updateData(CharacterUpdateDto character) {
        if (character.name() != null) {
            this.name = character.name();
        }
        if (character.healthPoints() > 0) {
            this.healthPoints = character.healthPoints();
        }
        if (character.strength() > 0) {
            this.strength = character.strength();
        }
        if (character.defence() > 0) {
            this.defence = character.defence();
        }
        if (character.agility() > 0) {
            this.agility = character.agility();
        }
        if (character.diceQuantity() > 0) {
            this.diceQuantity = character.diceQuantity();
        }
        if (character.diceType() != null) {
            this.diceType = character.diceType();
        }
        if (character.faction() != null) {
            this.faction = character.faction();
        }
    }
}
