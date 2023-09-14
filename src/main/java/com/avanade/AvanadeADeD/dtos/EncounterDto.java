package com.avanade.AvanadeADeD.dtos;

import java.util.List;

public record EncounterDto(
        Long heroId,
        Long monsterId,
        List<TurnDto> turnList,
        String winnerName
) {
}
