package factoryMethod.products;

// Classe concrète pour un CV
public class Resume implements Document {
    @Override
    public void create() {
        System.out.println("Creating a resume.");
    }
}
