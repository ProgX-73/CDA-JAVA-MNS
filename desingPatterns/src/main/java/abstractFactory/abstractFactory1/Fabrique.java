package abstractFactory.abstractFactory1;

 abstract public class Fabrique {

    public Cadre assembleCadre(){
        Cadre cadre = creerCadre();
        cadre.implementation();
        return cadre;
    }
    public  abstract Cadre creerCadre();
}
