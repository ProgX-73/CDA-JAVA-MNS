package abstractFactory.personnages.factories;

import abstractFactory.personnages.characters.Character;
import abstractFactory.personnages.characters.Mage;
import abstractFactory.personnages.weapons.Spell;
import abstractFactory.personnages.weapons.Weapon;

// Factory pour créer des personnages de type Mage avec leurs armes associées
public class MageFactory implements GameFactory {
    @Override
    public Character createCharacter() {
        return new Mage();
    }

    @Override
    public Weapon createWeapon() {
        return new Spell();
    }
}
