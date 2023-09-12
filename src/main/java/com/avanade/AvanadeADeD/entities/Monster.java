package com.avanade.AvanadeADeD.entities;

import com.avanade.AvanadeADeD.interfaces.Combatant;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Monster extends Character implements Combatant {
    @Override
    public void attack(java.lang.Character target) {

    }

    @Override
    public int getAttackDamage() {
        return 0;
    }
}
