package abstractFactory.abstractFactory3;

import abstractFactory.abstractFactory3.composants.cadre.Cadre;
import abstractFactory.abstractFactory3.composants.roue.Roue;

abstract public class Fabrique {
    public  abstract Cadre creerCadre();
    public  abstract Roue creerRoue();
}
