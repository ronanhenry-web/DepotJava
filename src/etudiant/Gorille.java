package etudiant;

public class Gorille extends Animal {
	private String couleur;
	
	public Gorille(String nom, String prenom, int taille, int age, String espece, String couleur) {
		super(nom, prenom, taille, age, espece);
		this.couleur = couleur;
	}
	
	public void sePresenter() {
		System.out.println("Mon " + espece + " s'appelle " + nom + prenom + " , il fait " + taille + " centimètre. Il a plusieurs couleurs mais il est surtout " + couleur + ", pour finir il a " + age + " ans.");
	}
}
