package com.tkm3d1a.dndcharactercreator.CharacterClass;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(
        uniqueConstraints = {@UniqueConstraint(
                name = "UniqueClassName",
                columnNames = {"className"})}
)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CharacterClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classID;

    @Enumerated(EnumType.STRING)
    private CharacterClassEnum className;

    private double constitutionMod;
    private double strengthMod;
    private double dexterityMod;
    private double intelligenceMod;
    private double wisdomMod;
    private double perceptionMod;

}
