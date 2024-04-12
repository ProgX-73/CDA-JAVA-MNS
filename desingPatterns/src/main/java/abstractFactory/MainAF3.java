package abstractFactory;



import abstractFactory.abstractFactory3.Fabrique;
import abstractFactory.abstractFactory3.composants.cadre.Cadre;
import abstractFactory.abstractFactory3.composants.fabricant.FabriqueDecathlon;
import abstractFactory.abstractFactory3.composants.fabricant.FabriqueTrek;
import abstractFactory.abstractFactory3.composants.roue.Roue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainAF3 {
    public static void main(String[] args) {
        /** CLIENT Abstrat Factory 3 **/
        Fabrique decath = new FabriqueDecathlon();
        Cadre cadreD = decath.creerCadre();
        Roue roueD = decath.creerRoue();

        Fabrique treck = new FabriqueTrek();
        Cadre cadreT = treck.creerCadre();
        Roue roueT = treck.creerRoue();


    }
}
