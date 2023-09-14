package com.avanade.AvanadeADeD.controllers;

import com.avanade.AvanadeADeD.dtos.HeroDto;
import com.avanade.AvanadeADeD.entities.DiceType;
import com.avanade.AvanadeADeD.entities.Hero;
import com.avanade.AvanadeADeD.interfaces.HeroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroRepository repository;

    @GetMapping
    public Hero getHero(){
        Hero hero = new Hero("Aragorn", 100, 45, 23, 1, DiceType.D8);

        return hero;
    }

    @PostMapping
    @Transactional
    public void createHero(@RequestBody HeroDto hero){
        repository.save(new Hero(hero));
        System.out.println(hero);
    }

}
