package mois;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    int choice = (int) (Math.random() * 12); // Generate a random number between 0 and 11
//    monthChoice(choice); // Call the method to print the month
    
    Month month = new Month();
    System.out.println(month.get(5));
   
  }
  
  public static void monthChoice(int choice) {
    switch (choice) {
      case 0:
        System.out.println("Le choix est Janvier.");
        break;
      case 1:
        System.out.println("Le choix est Février.");
        break;
      case 2:
        System.out.println("Le choix est Mars.");
        break;
      case 3:
        System.out.println("Le choix est Avril.");
        break;
      case 4:
        System.out.println("Le choix est Mai.");
        break;
      case 5:
        System.out.println("Le choix est Juin.");
        break;
      case 6:
        System.out.println("Le choix est Juillet.");
        break;
      case 7:
        System.out.println("Le choix est Août.");
        break;
      case 8:
        System.out.println("Le choix est Septembre.");
        break;
      case 9:
        System.out.println("Le choix est Octobre.");
        break;
      case 10:
        System.out.println("Le choix est Novembre.");
        break;
      case 11:
        System.out.println("Le choix est Décembre.");
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + choice);
    }
  }
}

