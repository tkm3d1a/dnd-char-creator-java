package com.tkm3d1a.dndcharactercreator.Character;

import com.tkm3d1a.dndcharactercreator.CharacterClass.CharacterClassEnum;
import com.tkm3d1a.dndcharactercreator.CharacterRace.CharacterRaceEnum;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

// TODO: convert to JPA entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Character {

    //TODO: first + last should be a unique key?
    private String firstName;
    private String lastName;

    //TODO: this needs to be @Enumerated when converting to entity
    private CharacterClassEnum classEnum;

    //TODO: this needs to be @Enumerated when converting to entity
    private CharacterRaceEnum raceEnum;

    private double constitution;
    private double strength;
    private double dexterity;
    private double intelligence;
    private double wisdom;
    private double perception;
}
