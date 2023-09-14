package com.avanade.AvanadeADeD.dtos;

import com.avanade.AvanadeADeD.entities.DiceType;
import com.avanade.AvanadeADeD.entities.Faction;
import jakarta.validation.constraints.NotNull;

public record CharacterUpdateDto(
        @NotNull
        Long id,
        String name,
        int healthPoints,
        int strength,
        int agility,
        int diceQuantity,
        DiceType diceType,
        Faction faction) {
}
