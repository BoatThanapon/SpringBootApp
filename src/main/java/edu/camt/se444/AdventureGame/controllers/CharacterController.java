package edu.camt.se444.AdventureGame.controllers;

import edu.camt.se444.AdventureGame.model.Character;
import edu.camt.se444.AdventureGame.services.ToonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class CharacterController {

    @RequestMapping("/character")
    public ArrayList<Character> GetAllCharacters(){
        ArrayList<Character> listCharacter = new ArrayList<Character>();
        Character Boat = new Character(1,"Boat",20,5,10);
        Character Joke = new Character(2,"Joke",28,6,4);
        Character Yok = new Character(3,"Yok",15,10,9);
        Character Matong = new Character(4,"Matong",30,15,15);

        listCharacter.add(Boat);
        listCharacter.add(Joke);
        listCharacter.add(Yok);
        listCharacter.add(Matong);

        return listCharacter;
    }


}
