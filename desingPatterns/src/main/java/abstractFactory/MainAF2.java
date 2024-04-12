package abstractFactory;


import abstractFactory.abstractFactory2.Fabrique;
import abstractFactory.abstractFactory2.Composant;
import abstractFactory.abstractFactory2.composants.fabricant.FabriqueDecathlon;
import abstractFactory.abstractFactory2.composants.fabricant.FabriqueTrek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainAF2 {
    public static void main(String[] args) {
        /** CLIENT Abstrat Factory 2 **/
        Fabrique decath = new FabriqueDecathlon();
        Composant cadreD = decath.creerComposant("CADRE");
        //CAST si je veux manipuler le cadre
        //mais je sais que je rappatrie bien des composants de la marque.

        Fabrique treck = new FabriqueTrek();
        Composant cadreT = treck.creerComposant("CADRE");
        Composant roueT = treck.creerComposant("ROUE");

        //ok mais je dépend des conditionnelles (IF) des types de composants dont j'ai besoin
    }
}
