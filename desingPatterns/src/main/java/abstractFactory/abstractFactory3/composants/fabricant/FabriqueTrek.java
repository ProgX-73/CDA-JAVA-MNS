package abstractFactory.abstractFactory3.composants.fabricant;

import abstractFactory.abstractFactory3.Fabrique;
import abstractFactory.abstractFactory3.composants.cadre.CadreTrek;
import abstractFactory.abstractFactory3.composants.cadre.Cadre;
import abstractFactory.abstractFactory3.composants.roue.Roue;
import abstractFactory.abstractFactory3.composants.roue.RoueTrek;

public class FabriqueTrek extends Fabrique {

    @Override
    public Cadre creerCadre() {
        return new CadreTrek();
    }

    @Override
    public Roue creerRoue() {
        return new RoueTrek();
    }
}
