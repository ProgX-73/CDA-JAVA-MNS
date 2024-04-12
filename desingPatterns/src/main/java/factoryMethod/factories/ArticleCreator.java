package factoryMethod.factories;

import factoryMethod.products.Article;
import factoryMethod.products.Document;

// Factory pour créer des articles
public class ArticleCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Article();
    }
}
