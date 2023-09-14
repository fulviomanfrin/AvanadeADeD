package com.avanade.AvanadeADeD.interfaces;

import com.avanade.AvanadeADeD.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
