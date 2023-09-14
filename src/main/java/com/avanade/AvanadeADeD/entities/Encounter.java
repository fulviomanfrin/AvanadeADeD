package com.avanade.AvanadeADeD.entities;

import com.avanade.AvanadeADeD.dtos.EncounterDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "encounters")
@Entity(name = "Encounter")
public class Encounter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;
    @Column(name = "hero_id")
    private Long heroId;
    @Column(name = "monster_id")
    private Long monsterId;
    @OneToMany(mappedBy = "encounter", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Turn> turnList;
    @Column(name = "winner_name")
    private String winnerName;

    public Encounter(EncounterDto encounter) {
    }
}
