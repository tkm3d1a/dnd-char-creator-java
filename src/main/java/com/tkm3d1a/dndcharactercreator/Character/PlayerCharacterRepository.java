package com.tkm3d1a.dndcharactercreator.Character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCharacterRepository extends JpaRepository<PlayerCharacter, Integer> {
}
