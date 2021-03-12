package etudiant;

public class Chien extends Animal{
	private String couleur;
	private String race;
	
	public Chien(String nom, String prenom, int taille, int age, String espece, String couleur, String race) {
		super(nom, prenom, taille, age, espece);
		this.couleur = couleur;
		this.race = race;
	}
	
	public void sePresenter() {
		System.out.println("Mon " + espece + " qui est un " + race + " s'appelle " + nom + prenom + " , il fait " + taille + " centim�tre. Il a plusieurs couleurs mais il est surtout " + couleur + ", pour finir il a " + age + " ans.");
	}
	
	//Permet de modifier l'ID et ainsi faire des tests sur les propriétés
	public String toString() {
		return nom + " " + race;
	}
 }
