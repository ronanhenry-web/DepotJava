package etudiant;

public class Animal {
	protected String nom;
	protected String prenom;
	protected int taille;
	protected int age;
	protected String espece;
	
	public Animal(String nom, String prenom, int taille, int age, String espece) {
		this.nom = nom;
		this.prenom = prenom;
		this.taille = taille;
		this.age = age;
		this.espece = espece;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	
	public void sePresenter() {
		System.out.println("Je suis un animal");
	}
}
