package abstractFactory.personnages.weapons;

import abstractFactory.personnages.weapons.Weapon;

public class Spell implements Weapon {
    @Override
    public void wield() {
        System.out.println("Spell is cast");
    }
}
