package abstractFactory.personnages.factories;

import abstractFactory.personnages.characters.Character;
import abstractFactory.personnages.weapons.Weapon;

// Abstract Factory pour créer des personnages et leurs armes associées
public interface GameFactory {
    Character createCharacter();
    Weapon createWeapon();
}
