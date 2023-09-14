package com.avanade.AvanadeADeD.controllers;

import com.avanade.AvanadeADeD.dtos.CharacterDto;
import com.avanade.AvanadeADeD.dtos.EncounterDto;
import com.avanade.AvanadeADeD.entities.Character;
import com.avanade.AvanadeADeD.entities.Encounter;
import com.avanade.AvanadeADeD.interfaces.CharacterRepository;
import com.avanade.AvanadeADeD.interfaces.EncounterRepository;
import com.avanade.AvanadeADeD.services.EncounterService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encounter")
public class EncounterController {


    private EncounterService encounterService;
    @Autowired
    private EncounterRepository encounterRepository;

    @PostMapping
    @Transactional
    public void createEncounter(@RequestBody EncounterDto encounter) {

        encounterRepository.save(new Encounter(encounter));
    }

//    @PostMapping
//    public void RunEncounter(@RequestBody Long heroId, Long monsterId) {
// encounterService.runEncounter(heroId, monsterId);
//    }
}
