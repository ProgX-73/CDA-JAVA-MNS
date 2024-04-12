package factoryMethod.products;

// Classe concrète pour un article
public class Article implements Document {
    @Override
    public void create() {
        System.out.println("Creating an article.");
    }
}
