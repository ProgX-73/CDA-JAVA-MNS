package factoryMethod.products;

// Classe concrète pour une lettre
public class Letter implements Document {
    @Override
    public void create() {
        System.out.println("Creating a letter.");
    }
}
