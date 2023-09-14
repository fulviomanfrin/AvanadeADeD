package com.avanade.AvanadeADeD.services;

import com.avanade.AvanadeADeD.entities.DiceType;
import com.avanade.AvanadeADeD.entities.Encounter;
import com.avanade.AvanadeADeD.entities.Turn;
import com.avanade.AvanadeADeD.interfaces.EncounterRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class EncounterService {
    private EncounterRepository repository;
    private TurnService turnService;
    private Random random;
    private List<Turn> turns = new ArrayList<>();


    public Encounter runEncounter(Long heroId, Long monsterId) {
        var encounter = new Encounter();
        if (heroHasInitiative()){
            runTurns(heroId, monsterId);
        } else {
            runTurns(monsterId, heroId);
        }

        endEncounter();

        return encounter;
    }

    private List<Turn> runTurns(Long attackerId, Long defenderId) {
        return turnService.runTurns(attackerId, defenderId);
    }

    private void endEncounter() {
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
