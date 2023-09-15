package com.avanade.AvanadeADeD.dtos;

import com.avanade.AvanadeADeD.entities.DiceType;
import com.avanade.AvanadeADeD.entities.Faction;

public record CharacterDto(String name,
                           int healthPoints,
                           int strength,
                           int defence,
                           int agility,
                           int diceQuantity,
                           DiceType diceType,
                           Faction faction) {
}
