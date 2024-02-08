package distributeursBoissons;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import distributeursBoissons.magasin.FabriqueProduit;
import distributeursBoissons.magasin.IMagasin;
import distributeursBoissons.magasin.margot.Magasin;


public class Main {
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		
		IMagasin mag;
		
		System.out.println("Choisissez un magasin :");
		System.out.println("1 : magasin de Margot");
		System.out.println("2 : magasin de Nordine ");
		System.out.println("3 : magasin de Hapsatou ");
		System.out.println("4 : magasin de Fred ");
		int choix = new Scanner(System.in).nextInt();
		switch(choix){
		case 1: {
			distributeursBoissons.magasin.margot.Magasin margotMag = new distributeursBoissons.magasin.margot.Magasin();
			mag = margotMag;
			break;
		}
		case 2 : {
				distributeursBoissons.magasin.nordine.Magazin nordineMag = new distributeursBoissons.magasin.nordine.Magazin();
				mag = nordineMag;
				break;
			}
		case 3 : {
			distributeursBoissons.magasin.hapsatou.Magasin hapsatouMag = new distributeursBoissons.magasin.hapsatou.Magasin();
			mag = hapsatouMag;
			break;
		}
		case 4 : {
			distributeursBoissons.magasin.fred.Magasin fredMag = new distributeursBoissons.magasin.fred.Magasin();
			mag = fredMag;
			break;
		}
		default : { mag = new distributeursBoissons.magasin.margot.Magasin();}
	}
		
		
		
		
		DistributeurBoissons distributeur = new DistributeurBoissons();
		
		distributeur.chargeMagasin(mag);
		distributeur.demarrage();
		
		
		
		
	
	}

	

}
