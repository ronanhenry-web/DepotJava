package etudiant;

public class Animal {
	private String nom;
	private int taille;
	private String couleur;
	private int force;
	private String type;
	
	
	public Animal(String p_nom, int p_taille, String p_couleur, int p_force, String p_type) {
		nom = p_nom;
		taille = p_taille;
		couleur = p_couleur;
		force = p_force;
		type = p_type;
	}
	
	public void sePresenter() {
		System.out.println("Mon animal s'appelle " + nom + " , il fait " + taille + " centimètre. Il a plusieurs couleur mais il est surtout : " + couleur + " , sa force va jusqu'à  " + force + " damage sur 300. Pour finir son type est " + type + ".");
	}
	
	public void actionVoler() {
		System.out.println(nom + " vole de manière élégant");
	}
}
