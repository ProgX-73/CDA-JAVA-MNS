package abstractFactory.abstractFactory1;

public class FabriqueDecathlon extends Fabrique {
    @Override
    public Cadre creerCadre() {
        return new CadreDecathlon();
    }
}
