package etudiant;

public class Cochon extends Animal{
	private String couleur;
	
	public Cochon(String nom, String prenom, int taille, int age, String espece, String couleur) {
		super(nom, prenom, taille, age, espece);
		this.couleur = couleur;
	}
}
