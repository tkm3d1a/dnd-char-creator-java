package com.tkm3d1a.dndcharactercreator.PlayerCharacter;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(
        uniqueConstraints = {@UniqueConstraint(
                name = "UniqueCharacterName",
                columnNames = {"firstName","lastName"})}
)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerID;

    private String firstName;
    private String lastName;

    //TODO: this should be a join on the character class table? or foreign key?
//    private CharacterClassEnum classEnum;

    //TODO: this should be a join on the character race table? or foreign key?
//    private CharacterRaceEnum raceEnum;

    private double constitution;
    private double strength;
    private double dexterity;
    private double intelligence;
    private double wisdom;
    private double perception;
}
