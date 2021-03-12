package etudiant;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//Mettre chien avant Etudiant car sinon Vinssou ne sera pas déclaré
		Chien Vinssou = new Chien(100, 55, "Vinssou", "Bulldog");//0
		Chien Huugo = new Chien(125, 43, "huugo", "Golden retriever");//1
		
		Etudiant Ronan = new Etudiant("HENRY", "Ronan", 19, "BTS SIO");
		Etudiant Vinz = new Etudiant("LIERMANN", "Vincent", 18, "FAC");
		Etudiant Aissam = new Etudiant("BERKANI", "Aissam", 19, "BTS SIO");
		Etudiant Hugo = new Etudiant("GAPAILLART", "Hugo", 20, "FAC");
		
		Classe BTS = new Classe("BTS SIO :");
		Classe FAC = new Classe("FAC :");
		
		Animal Pichu = new Animal("Pichu", 123, "jaune", 180, "electrique");
		Animal Dracaufeu = new Animal("Dracaufeu", 321, "orange", 210, "feu");
		
		List<Chien>chenil = new ArrayList<Chien>();
		chenil.add(Vinssou);
		chenil.add(Huugo);
		
		Ronan.ajouterChien(Vinssou);
		Ronan.ajouterChien(Huugo);
		Ronan.retirerChien(1);
		
		Ronan.ajouterAnimal(Dracaufeu);
		
		Ronan.sePresenter();
		
		Dracaufeu.actionVoler();
		
		for (int i = 0; i < chenil.size(); i++) {
			//System.out.println(chenil.get(i));//Presente la race des chiens
		}
		
		BTS.addEtudiant(Aissam);
		FAC.addEtudiant(Vinz);
		FAC.addEtudiant(Hugo);
		FAC.removeEtudiant(1);
		
		//BTS.presenterClasse();
		//FAC.presenterClasse();
		
		FAC.getEtudiant(1);
		
		
	}
}
