package com.avanade.AvanadeADeD.interfaces;

import com.avanade.AvanadeADeD.entities.Encounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncounterRepository extends JpaRepository<Encounter, Long> {

    Long startEncounter(Long heroId, Long monsterId);

}
