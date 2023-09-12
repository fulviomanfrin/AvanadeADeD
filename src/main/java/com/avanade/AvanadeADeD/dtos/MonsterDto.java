package com.avanade.AvanadeADeD.dtos;

import com.avanade.AvanadeADeD.entities.DiceType;

public record MonsterDto(String name, int healthPoints, int strength, int agility, int diceQuantity, DiceType diceType) {
}