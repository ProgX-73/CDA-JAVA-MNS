package factoryMethod.factories;

import factoryMethod.products.Document;
import factoryMethod.products.Resume;

// Factory pour créer des CVs
public class ResumeCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Resume();
    }
}