package com.avanade.AvanadeADeD.entities;

import com.avanade.AvanadeADeD.interfaces.Combatant;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;

@AllArgsConstructor
public class Hero extends Character implements Combatant {

    public Hero(String aragorn, int i, int i1, int i2, int i3, DiceType diceType) {
        setName(aragorn);
        setHealthPoints(i);
        setStrength(i1);
        setAgility(i2);
        setDiceQuantity(i3);
        setDiceType(diceType);
    }

    @Override
    public void attack(java.lang.Character target) {

    }

    @Override
    public int getAttackDamage() {
        Random random = new Random();


        return getStrength() + (getDiceQuantity() * random.nextInt(getDiceType().getSizes()) + 1);
    }
}
