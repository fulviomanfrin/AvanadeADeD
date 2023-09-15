package com.avanade.AvanadeADeD.services;

import com.avanade.AvanadeADeD.entities.Character;
import com.avanade.AvanadeADeD.entities.Turn;
import com.avanade.AvanadeADeD.interfaces.CharacterRepository;
import com.avanade.AvanadeADeD.interfaces.TurnRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TurnService {
    private TurnRepository repository;
    private CharacterRepository characterRepository;
    private Character attacker;
    private Character defender;

    public List<Turn> runTurns(Long attackerId, Long defenderId) {
        attacker = characterRepository.getReferenceById(attackerId);
        var attackerHP = attacker.getHealthPoints();
        defender = characterRepository.getReferenceById(defenderId);
        var defenderHP = defender.getHealthPoints();

        do {
            combat(attacker, defender);
            System.out.println(" turno feito");
        } while (attackerHP > 0 || defenderHP > 0);

        return new ArrayList<>();
    }

    private void combat(Character attacker, Character defender) {

    }
}
