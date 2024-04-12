package factoryMethod.factories;

import factoryMethod.products.Document;

// Classe abstraite pour créer des documents
public abstract class DocumentCreator {
    public abstract Document createDocument();
}
