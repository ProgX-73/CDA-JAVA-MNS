package factoryMethod;

import factoryMethod.factories.ArticleCreator;
import factoryMethod.factories.DocumentCreator;
import factoryMethod.factories.LetterCreator;
import factoryMethod.factories.ResumeCreator;
import factoryMethod.products.Document;

public class Main {
    public static void main(String[] args) {
        // Utilisation du Factory Method pour créer une lettre
        DocumentCreator letterCreator = new LetterCreator();
        Document letter = letterCreator.createDocument();
        letter.create();

        // Utilisation du Factory Method pour créer un CV
        DocumentCreator resumeCreator = new ResumeCreator();
        Document resume = resumeCreator.createDocument();
        resume.create();

        // Utilisation du Factory Method pour créer un article
        DocumentCreator articleCreator = new ArticleCreator();
        Document article = articleCreator.createDocument();
        article.create();
    }
}
