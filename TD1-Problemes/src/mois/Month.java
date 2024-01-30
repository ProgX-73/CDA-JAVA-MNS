package mois;
import java.util.HashMap;

public class Month extends HashMap<Integer, String> {
  
  // public void Month () le problème était juste ici, tu as mis void, un constructeur est une methode spéciale, elle n'a pas le type de retour indiqué
  public Month () {
    this.put(0, "Janvier");//tu as initialisé à 0 mais ici tu peux mettre 1 comme les "vrais" mois :D
    this.put(1, "Février");
    this.put(2, "Mars");
    this.put(3, "Avril");
    this.put(4, "Mai");
    this.put(5, "Juin");
    this.put(6, "Juillet");
    this.put(7, "Août");
    this.put(8, "Septembre");
    this.put(9, "Octobre");
    this.put(10, "Novembre");
    this.put(11, "Décembre");
  }
}