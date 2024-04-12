package abstractFactory.personnages.characters;

import abstractFactory.personnages.characters.Character;

public class Mage implements Character {
    @Override
    public void attack() {
        System.out.println("Mage attacks with a spell");
    }
}
