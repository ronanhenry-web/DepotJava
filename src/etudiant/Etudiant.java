package etudiant;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	
	private String nom;
	private String prenom;
	private int age;
	private String classe;
	private List<Chien> chiens;
	private List<Animal> animaux;
	
	public Etudiant(String p_nom, String p_prenom, int p_age, String p_classe) {
		nom = p_nom;
		prenom = p_prenom;
		age = p_age;
		classe = p_classe;
		chiens = new ArrayList<Chien>();//Pas de besoin de mettre de paramÃ¨tre
		animaux = new ArrayList<Animal>();
	}
	
	public void sePresenter() {
		System.out.println("Bonjour, je me présente je m'appelle " + nom + " " + prenom + " et j'ai " + age + " ans. Actuellement je suis en " + classe + ".");
		for(int i = 0; i < chiens.size(); i++) {//size = length
			chiens.get(i).sePresenter();
		}
		for(int i = 0; i < animaux.size(); i++) {//size = length
			animaux.get(i).sePresenter();
		}
	}
	
	public void ajouterChien(Chien p_chien) {
		chiens.add(p_chien);
	}
	
	public void retirerChien(int numeroChien) {
		chiens.remove(numeroChien);
	}
	
	public void ajouterAnimal(Animal p_animal) {
		animaux.add(p_animal);
	}
	
	public void retirerAnimal(int numeroAnimal) {
		animaux.remove(numeroAnimal);
	}
}
