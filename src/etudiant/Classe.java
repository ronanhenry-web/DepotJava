package etudiant;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	private String libelle;
	private List<Etudiant> etudiants;

	public Classe(String p_libelle) {
		libelle = p_libelle;
		etudiants = new ArrayList<Etudiant>();
	}
	
	List<Etudiant> getEtudiants() {
		return etudiants ;
	}
	
	public List<Etudiant> getEtudiant(int index) {
		return etudiants;
	}
	
	public void addEtudiant(Etudiant p_etudiant) {
		etudiants.add(p_etudiant);
	}
	
	public void removeEtudiant(int num_etudiant) {
		etudiants.remove(num_etudiant);
	}
	
	public void presenterClasse() {
		System.out.println("Voici la classe de " + libelle + ".");
		for(int i = 0; i < etudiants.size(); i++) {//size = length
			etudiants.get(i).sePresenter();
		}
	}
}