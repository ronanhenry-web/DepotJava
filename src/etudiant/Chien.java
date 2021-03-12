package etudiant;

public class Chien {
	private int taille;
	private int age;
	private String nom;
	private String race;
	
	
	public Chien(int taille, int age, String nom, String race) {
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.race = race;
	}
	
	public void sePresenter() {
		System.out.println("Mon chien fait " + taille + " centimËtre et il a " + age + " ans (‚ge de chien). Mon chien s'appelle " + nom + " et il est un peu gros mais mignon comme un " + race + ".");
	}
	
	//Permet de modifier l'ID et ainsi faire des tests sur les propri√©t√©s
	public String toString() {
		return nom + " " + race;
	}
 }
