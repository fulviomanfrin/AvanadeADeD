package com.avanade.AvanadeADeD.entities;

import com.avanade.AvanadeADeD.interfaces.Combatant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Table(name = "monsters")
@Entity(name = "Monster")
public class Monster extends Character implements Combatant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "monster_id")
    private Long id;

    public Monster(String name, int healthPoints, int strength, int agility, int diceQuantity, DiceType diceType) {
        super(name, healthPoints, strength, agility, diceQuantity, diceType);
    }

    public Monster() {
        super();
    }

    @Override
    public void attack(java.lang.Character target) {

    }

    @Override
    public int getAttackDamage() {
        return 0;
    }
}
