package abstractFactory.abstractFactory2.composants.fabricant;

import abstractFactory.abstractFactory2.Composant;
import abstractFactory.abstractFactory2.Fabrique;
import abstractFactory.abstractFactory2.composants.cadre.CadreDecathlon;
import abstractFactory.abstractFactory2.composants.roue.RoueDecathlon;

public class FabriqueDecathlon extends Fabrique {

    @Override
    public Composant creerComposant(String type) {
        if("CADRE".equals(type))
            return new CadreDecathlon();
        else
            return new RoueDecathlon();
    }
    /**
     * Ce code est fonctionnel et résout bien la préblématique mais...
     * SI on ajout de nouveaux composants ce code devra être modifié
     * à chaque fois, c'était la situation finale du cours Factory Method
     */
}
