package etudiant;

public class PersoAnimal {
	private String nom;
	private int taille;
	private String couleur;
	private String espece;
	
	
	public PersoAnimal(String p_nom, int p_taille, String p_couleur, String p_espece) {
		nom = p_nom;
		taille = p_taille;
		couleur = p_couleur;
		espece = p_espece;
	}
	
	public void sePresenter() {
		System.out.println("Mon animal s'appelle " + nom + " , il fait " + taille + " centimètre. Il a plusieurs couleurs mais il est surtout " + couleur + ", pour finir son type est un/une " + espece + ".");
	}
	
	public void actionVoler() {
		System.out.println(nom + " vole de manière élégant");
	}
	
	public void actionAttaquer() {
		System.out.println(nom + " attaque !!!");
	}
}
