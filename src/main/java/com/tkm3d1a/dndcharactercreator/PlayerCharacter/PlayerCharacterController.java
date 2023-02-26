package com.tkm3d1a.dndcharactercreator.PlayerCharacter;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("character")
public class PlayerCharacterController {

    private final PlayerCharacterRepository pcRepo;

    public PlayerCharacterController(PlayerCharacterRepository pcRepo) {
        this.pcRepo = pcRepo;
    }

    @GetMapping(value = "/get-all", produces = "application/json")
    public List<PlayerCharacter> getAllCharacters(){
        return findAllCharacters();
    }

    @PostMapping(value = "/new-character")
    public PlayerCharacter newPlayerCharacter(@RequestBody PlayerCharacter newPlayerCharacter){
        //TODO: check if player name is unique before attempting save
        //TODO: add some required fields to allow this to save
        //TODO: add responses for required fields not given
        //TODO: add response for name not unique
        //TODO: extract save to a service class
        return pcRepo.save(newPlayerCharacter);
    }

    @PutMapping(value = "/update/{id}")
    public AtomicReference<PlayerCharacter> updatePlayerCharacter(@RequestBody PlayerCharacter newPlayerCharacter, @PathVariable int id){
        Optional<PlayerCharacter> optionalPlayerCharacter = pcRepo.findById(id);
        //TODO: Check if Atomic reference is correct way to handle this
        AtomicReference<PlayerCharacter> savedCharacter = new AtomicReference<>(new PlayerCharacter());

        //TODO: Check if first + last is unique with the newPlayerCharacter
        //TODO: don't update if the attributes are 0 or null
        if(optionalPlayerCharacter.isPresent()){
            optionalPlayerCharacter.map(playerCharacter -> {
                playerCharacter.setDexterity(newPlayerCharacter.getDexterity());
                playerCharacter.setConstitution(newPlayerCharacter.getConstitution());
                playerCharacter.setPerception(newPlayerCharacter.getPerception());
                playerCharacter.setIntelligence(newPlayerCharacter.getIntelligence());
                playerCharacter.setWisdom(newPlayerCharacter.getWisdom());
                playerCharacter.setStrength(newPlayerCharacter.getStrength());
                playerCharacter.setFirstName(newPlayerCharacter.getFirstName());
                playerCharacter.setLastName(newPlayerCharacter.getLastName());
                //TODO: extract save to a service class
                savedCharacter.set(pcRepo.save(playerCharacter));
                return null;
            });
        } else {
            //TODO: extract save to a service class
            //TODO: Add notification on when update is resulting in a new entry versus updating existing
            savedCharacter.set(pcRepo.save(newPlayerCharacter));
        }

        return savedCharacter;
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletePlayerCharacter(@PathVariable int id){
        //TODO: check if this id exists first
        //TODO: extract delete to service class
        pcRepo.deleteById(id);
    }

    //TODO: Move methods to a service class
    private List<PlayerCharacter> findAllCharacters() {
//        return pcRepo.findAll(Sort.by(Sort.Direction.DESC, "firstName"));
        return pcRepo.findAll(Sort.by(Sort.Direction.ASC, "playerID"));
    }


}
