package com.tkm3d1a.dndcharactercreator.CharacterRace;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

// TODO: convert to JPA entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CharacterRace {

    //TODO: Ensure this is unique, only one race should be made for each race name enum
    private CharacterRaceEnum raceName;

    private double constitutionMod;
    private double strengthMod;
    private double dexterityMod;
    private double intelligenceMod;
    private double wisdomMod;
    private double perceptionMod;
}
