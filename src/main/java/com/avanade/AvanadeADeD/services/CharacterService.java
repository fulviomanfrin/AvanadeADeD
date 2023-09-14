package com.avanade.AvanadeADeD.services;

import com.avanade.AvanadeADeD.dtos.CharacterDto;
import com.avanade.AvanadeADeD.dtos.CharacterUpdateDto;
import com.avanade.AvanadeADeD.entities.Character;
import com.avanade.AvanadeADeD.interfaces.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CharacterService {
    @Autowired
    private CharacterRepository repository;

    public void createCharacter(CharacterDto characterDto){
        repository.save(new Character(characterDto));
    }

    public List<Character> ListCharacters() {

        return repository.findAll();
    }

    public Optional<Character> getCharacterById( Long id){

        return repository.findById(id);
    }

    public void updateCharacter(CharacterUpdateDto character){
        var existingCharacter = repository.getReferenceById(character.id());
        existingCharacter.updateData(character);

    }

    public void deleteCharacter(Long id){
        repository.deleteById(id);
    }

}
