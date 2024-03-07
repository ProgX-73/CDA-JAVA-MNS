package listeners;

import beans.Personne;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.util.ArrayList;

@WebListener
public class AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //Au démarrage de l'application

        Personne p1 = new Personne();
        p1.setNom("Jones");
        p1.setPrenom("Indiana");
        p1.setAge(67);

        Personne p2 = new Personne();
        p2.setNom("Connor");
        p2.setPrenom("Sarah");
        p2.setAge(41);

        Personne p3 = new Personne();
        p3.setNom("Ripley");
        p3.setPrenom("Ellen");
        p3.setAge(31);

        ArrayList<Personne> listPersonne = new ArrayList<>();
        listPersonne.add(p1);
        listPersonne.add(p2);
        listPersonne.add(p3);
        //On place la liste dans le scope application = servletContext
        sce.getServletContext().setAttribute("listPersonne",listPersonne);
    }
}
