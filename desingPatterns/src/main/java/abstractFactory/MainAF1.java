package abstractFactory;

import abstractFactory.abstractFactory1.*;

public class MainAF1 {
    public static void main(String[] args) {
        /** CLIENT Abstract Factory 1 **/
        Fabrique decath = new FabriqueDecathlon();
        Cadre cadre = decath.creerCadre();

        //ok mais si on veut étendre la production avec des roues ?
    }
}
