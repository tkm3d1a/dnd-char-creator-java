package com.tkm3d1a.dndcharactercreator.CharacterClass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterClassRepository extends JpaRepository<CharacterClass, Integer> {
}
