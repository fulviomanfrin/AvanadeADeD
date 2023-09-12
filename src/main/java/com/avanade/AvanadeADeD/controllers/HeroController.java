package com.avanade.AvanadeADeD.controllers;

import com.avanade.AvanadeADeD.dtos.HeroDto;
import com.avanade.AvanadeADeD.entities.DiceType;
import com.avanade.AvanadeADeD.entities.Hero;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @GetMapping
    public Hero getHero(){
        Hero hero = new Hero("Aragorn", 100, 45, 23, 1, DiceType.D8);
        return hero;
    }

    @PostMapping
    public void createHero(@RequestBody HeroDto hero){
        System.out.println(hero);
    }

}
