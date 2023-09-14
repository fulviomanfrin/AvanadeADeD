package com.avanade.AvanadeADeD.services;

import com.avanade.AvanadeADeD.entities.DiceType;
import com.avanade.AvanadeADeD.entities.Encounter;
import com.avanade.AvanadeADeD.interfaces.EncounterRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class EncounterService {
    private final EncounterRepository repository;
    private Random random;


    public Encounter runEncounter(Long heroId, Long monsterId) {
        var encounter = new Encounter();
        heroHasInitiative();

        return encounter;
    }

    private boolean heroHasInitiative() {
        int heroDice;
        int monsterDice;

        do {
            heroDice = rollDice(DiceType.D20, 1);
            monsterDice = rollDice(DiceType.D20, 1);
        } while (heroDice == monsterDice);

        return heroDice > monsterDice;
    }

    public int rollDice(DiceType diceType, int diceQuantity) {
        var result = random.nextInt(diceType.getSizes()) + 1;
        return result;
    }

}
