package abstractFactory.personnages.characters;

import abstractFactory.personnages.characters.Character;

// Classes concrètes pour les personnages
public class Warrior implements Character {
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword");
    }
}

