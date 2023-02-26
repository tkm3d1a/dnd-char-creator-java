package com.tkm3d1a.dndcharactercreator.CharacterRace;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(
        uniqueConstraints = {@UniqueConstraint(
                name = "UniqueRaceName",
                columnNames = {"raceName"})}
)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CharacterRace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int raceID;

    @Enumerated(EnumType.STRING)
    private CharacterRaceEnum raceName;

    private double constitutionMod;
    private double strengthMod;
    private double dexterityMod;
    private double intelligenceMod;
    private double wisdomMod;
    private double perceptionMod;
}
