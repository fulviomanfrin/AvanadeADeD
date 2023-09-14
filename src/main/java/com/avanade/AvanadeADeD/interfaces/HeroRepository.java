package com.avanade.AvanadeADeD.interfaces;

import com.avanade.AvanadeADeD.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {
}
