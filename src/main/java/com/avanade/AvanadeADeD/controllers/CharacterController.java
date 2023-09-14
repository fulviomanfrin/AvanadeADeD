package com.avanade.AvanadeADeD.controllers;

import com.avanade.AvanadeADeD.dtos.CharacterDto;
import com.avanade.AvanadeADeD.entities.Character;
import com.avanade.AvanadeADeD.interfaces.CharacterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/character")
public class CharacterController {
    @Autowired
    private CharacterRepository repository;

    @GetMapping
    @Transactional
    public List<Character> ListCharacters() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Character> getCharacter(@PathVariable Long id){
        return repository.findById(id);
    }

//    @PutMapping
//    public boolean updateCharacter(@RequestBody CharacterDto character){
//
//    }

    @PostMapping
    @Transactional
    public void createCharacter(@RequestBody CharacterDto character) {
        repository.save(new Character(character));
    }
}
