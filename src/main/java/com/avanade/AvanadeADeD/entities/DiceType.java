package com.avanade.AvanadeADeD.entities;

import lombok.Getter;

@Getter
public enum DiceType {
    D4(4),
    D6(6),
    D8(8),
    D12(12),
    D20(20);

    private final int sizes;

    DiceType(int sizes) {
        this.sizes = sizes;
    }
}
