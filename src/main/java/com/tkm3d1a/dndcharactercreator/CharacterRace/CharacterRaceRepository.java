package com.tkm3d1a.dndcharactercreator.CharacterRace;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRaceRepository extends JpaRepository<CharacterRace, Integer> {
}
