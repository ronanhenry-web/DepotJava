package etudiant;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Etudiant Ronan = new Etudiant("HENRY", "Ronan", 19, "BTS SIO");
		Etudiant Vinz = new Etudiant("LIERMANN", "Vincent", 18, "FAC");
		Etudiant Aissam = new Etudiant("BERKANI", "Aissam", 19, "BTS SIO");
		Etudiant Hugo = new Etudiant("GAPAILLART", "Hugo", 20, "FAC");
		
		Classe BTS = new Classe("BTS SIO :");
		Classe FAC = new Classe("FAC :");
		
		PersoAnimal Pichu = new PersoAnimal("Pichu", 123, "jaune", "pokémon");
		PersoAnimal Dracaufeu = new PersoAnimal("Dracaufeu", 321, "orange", "pokémon");
		
		Animal Saucisse = new Chien("Belle", "Saucisse", 30, 12, "Chien", "Marron", "Teckel");
		Animal KingKong = new Gorille("King", "Kong", 260, 26, "Gorille", "Gris");
		Animal PeppaPig = new Cochon("Peppa", "Pig", 80, 6, "Cochon", "Rose");
		
		//Animaux
		Ronan.addAnimaux(Saucisse);
		Ronan.addAnimaux(KingKong);
		Ronan.addAnimaux(PeppaPig);
		
		Ronan.sePresenter();
		
		//List<Chien>chenil = new ArrayList<Chien>();
		//chenil.add(Vinssou);
		//chenil.add(Huugo);
		
		/*for (int i = 0; i < chenil.size(); i++) {
			//System.out.println(chenil.get(i));//Presente la race des chiens
		}*/
		
		//Etudiants
		//Ronan.sePresenter();
		//Vinz.sePresenter();
		//Aissam.sePresenter();
		//Hugo.sePresenter();
		
		//Classes
		//BTS.addEtudiant(Aissam);
		//FAC.addEtudiant(Vinz);
		//FAC.addEtudiant(Hugo);
		//FAC.removeEtudiant(1);
		
		//BTS.presenterClasse();
		//FAC.presenterClasse();
	}
}
