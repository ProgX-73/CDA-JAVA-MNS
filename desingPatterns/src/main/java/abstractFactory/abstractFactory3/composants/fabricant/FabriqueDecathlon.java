package abstractFactory.abstractFactory3.composants.fabricant;

import abstractFactory.abstractFactory3.Fabrique;
import abstractFactory.abstractFactory3.composants.cadre.Cadre;
import abstractFactory.abstractFactory3.composants.cadre.CadreDecathlon;
import abstractFactory.abstractFactory3.composants.roue.Roue;
import abstractFactory.abstractFactory3.composants.roue.RoueDecathlon;

public class FabriqueDecathlon extends Fabrique {

    @Override
    public Cadre creerCadre() {
        return new CadreDecathlon();
    }

    @Override
    public Roue creerRoue() {
        return new RoueDecathlon();
    }
}
