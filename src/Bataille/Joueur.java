package Bataille;

public class Joueur {
	private String nom;
	private int nbPartiesGagnees;
	
	public Joueur(String nomJoueur, int nbPartieGagne){
		this.nom= nomJoueur;
		this.nbPartiesGagnees=nbPartieGagne;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public int getNbPartieGagne(){
		return this.nbPartiesGagnees;
	}
}
