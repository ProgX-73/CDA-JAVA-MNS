package factoryMethod.factories;
import factoryMethod.products.Document;
import factoryMethod.products.Letter;

// Factory pour créer des lettres
public class LetterCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Letter();
    }
}


