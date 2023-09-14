package com.avanade.AvanadeADeD.controllers;

import com.avanade.AvanadeADeD.dtos.CharacterDto;
import com.avanade.AvanadeADeD.entities.Character;
import com.avanade.AvanadeADeD.interfaces.CharacterRepository;
import com.avanade.AvanadeADeD.interfaces.EncounterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encounter")
public class EncounterController {

    @Autowired
    private EncounterRepository repository;

    @PostMapping
    @Transactional
    public void createCharacter(@RequestBody CharacterDto character) {

//        repository.save(new Character(character));
    }
}
