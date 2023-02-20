package com.tkm3d1a.dndcharactercreator;

import com.tkm3d1a.dndcharactercreator.Character.Character;
import com.tkm3d1a.dndcharactercreator.CharacterClass.CharacterClassEnum;
import com.tkm3d1a.dndcharactercreator.CharacterRace.CharacterRaceEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DndcharactercreatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DndcharactercreatorApplication.class, args);

        Character test = new Character("Test", "Name", CharacterClassEnum.PALADIN, CharacterRaceEnum.HUMAN, 10, 10, 10, 10, 10, 10);
//        System.out.println(test);
        log.info("Server started...");
        log.info("Displaying any extra info from 'main'...");
        log.info("{}",test);
        log.info("End display from main...");
    }

}
