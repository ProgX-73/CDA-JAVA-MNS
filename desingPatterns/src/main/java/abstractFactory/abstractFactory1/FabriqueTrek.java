package abstractFactory.abstractFactory1;

public class FabriqueTrek extends Fabrique {
    @Override
    public Cadre creerCadre() {
        return new CadreTrek();
    }
}
