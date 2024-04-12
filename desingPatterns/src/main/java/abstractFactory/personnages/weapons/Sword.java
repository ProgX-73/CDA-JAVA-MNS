package abstractFactory.personnages.weapons;

import abstractFactory.personnages.weapons.Weapon;

// Classes concrètes pour les armes
public class Sword implements Weapon {
    @Override
    public void wield() {
        System.out.println("Sword is wielded");
    }
}
