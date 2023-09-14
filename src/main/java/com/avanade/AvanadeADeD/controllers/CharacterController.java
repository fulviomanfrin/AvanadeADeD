package com.avanade.AvanadeADeD.controllers;

import com.avanade.AvanadeADeD.dtos.CharacterDto;
import com.avanade.AvanadeADeD.dtos.CharacterUpdateDto;
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

    @PutMapping
    @Transactional
    public void updateCharacter(@RequestBody CharacterUpdateDto character){
    var existingCharacter = repository.getReferenceById(character.id());
        existingCharacter.updateData(character);

    }

    @PostMapping
    @Transactional
    public void createCharacter(@RequestBody CharacterDto character) {

        repository.save(new Character(character));
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id){
        repository.deleteById(id);
    }

}
