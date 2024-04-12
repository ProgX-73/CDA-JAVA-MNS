package abstractFactory.personnages.factories;

import abstractFactory.personnages.characters.Character;
import abstractFactory.personnages.characters.Warrior;
import abstractFactory.personnages.weapons.Sword;
import abstractFactory.personnages.weapons.Weapon;

// Factory pour créer des personnages de type Warrior avec leurs armes associées
public class WarriorFactory implements GameFactory {
    @Override
    public Character createCharacter() {
        return new Warrior();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}

