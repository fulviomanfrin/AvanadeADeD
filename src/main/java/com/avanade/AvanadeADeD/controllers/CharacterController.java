package com.avanade.AvanadeADeD.controllers;

import com.avanade.AvanadeADeD.dtos.CharacterDto;
import com.avanade.AvanadeADeD.entities.Character;
import com.avanade.AvanadeADeD.interfaces.CharacterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {
    @Autowired
    private CharacterRepository repository;

    @GetMapping
    @Transactional
    public List<Character> ListCharacters(){

        return repository.findAll();
    }

    @PostMapping
    @Transactional
    public void createCharacter(@RequestBody CharacterDto character){
        repository.save(new Character(character));
    }
}
