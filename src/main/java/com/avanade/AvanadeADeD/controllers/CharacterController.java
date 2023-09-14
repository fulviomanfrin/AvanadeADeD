package com.avanade.AvanadeADeD.controllers;

import com.avanade.AvanadeADeD.dtos.CharacterDto;
import com.avanade.AvanadeADeD.dtos.CharacterUpdateDto;
import com.avanade.AvanadeADeD.entities.Character;
import com.avanade.AvanadeADeD.interfaces.CharacterRepository;
import com.avanade.AvanadeADeD.services.CharacterService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/character")
public class CharacterController {
    @Autowired
    private CharacterService service;

    @GetMapping
    @Transactional
    public List<Character> ListCharacters() {

        return service.ListCharacters();
    }

    @GetMapping("/{id}")
    public Optional<Character> getCharacterById(@PathVariable Long id){

        return service.getCharacterById(id);
    }

    @PutMapping
    @Transactional
    public void updateCharacter(@RequestBody CharacterUpdateDto character){
    service.updateCharacter(character);

    }

    @PostMapping
    @Transactional
    public void createCharacter(@RequestBody CharacterDto characterDto) {
        service.createCharacter(characterDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id){
        service.deleteCharacter(id);
    }

}
