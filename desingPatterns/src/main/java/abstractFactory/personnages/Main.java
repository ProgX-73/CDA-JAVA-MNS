package abstractFactory.personnages;

import abstractFactory.personnages.characters.Character;
import abstractFactory.personnages.factories.GameFactory;
import abstractFactory.personnages.factories.MageFactory;
import abstractFactory.personnages.factories.WarriorFactory;
import abstractFactory.personnages.weapons.Weapon;

public class Main {
    public static void main(String[] args) {
        // Création d'une factory pour les guerriers
        GameFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter();
        Weapon warriorWeapon = warriorFactory.createWeapon();

        warrior.attack();
        warriorWeapon.wield();

        // Création d'une factory pour les mages
        GameFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter();
        Weapon mageWeapon = mageFactory.createWeapon();

        mage.attack();
        mageWeapon.wield();


        /*** Après l'instanciation le programme ne se souciera plus du type de personnage.
         * L'arme utilisée et les caractéristiques seront déclenchés ou accessibles
         * "à travers les objets abstraits"
         */
    }
}
