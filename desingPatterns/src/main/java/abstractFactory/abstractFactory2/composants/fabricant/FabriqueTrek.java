package abstractFactory.abstractFactory2.composants.fabricant;

import abstractFactory.abstractFactory2.Composant;
import abstractFactory.abstractFactory2.Fabrique;
import abstractFactory.abstractFactory2.composants.cadre.CadreTrek;
import abstractFactory.abstractFactory2.composants.roue.RoueTrek;

public class FabriqueTrek extends Fabrique {
    @Override
    public Composant creerComposant(String type) {
        if("CADRE".equals(type))
            return new CadreTrek();
        else
            return new RoueTrek();
    }
    /**
     * Ce code est fonctionnel et résout bien la préblématique mais...
     * SI on ajout de nouveaux composants ce code devra être modifié
     * à chaque fois, c'était la situation finale du cours Factory Method
     */
}
