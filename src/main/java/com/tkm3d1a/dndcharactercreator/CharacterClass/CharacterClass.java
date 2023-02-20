package com.tkm3d1a.dndcharactercreator.CharacterClass;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

// TODO: convert to JPA entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CharacterClass {

    //TODO: Ensure this is unique, only one character class should be made for each class name enum
    private CharacterClassEnum className;

    private double constitutionMod;
    private double strengthMod;
    private double dexterityMod;
    private double intelligenceMod;
    private double wisdomMod;
    private double perceptionMod;

}
