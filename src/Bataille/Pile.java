package Bataille;
import java.util.*;

/**
 * Classe de gestion d'une pile de Cartes
 * @author Steeve Jerent / Tony Clonier
 */
public class Pile extends Observable {
	
	private Stack<Carte> pile;

/*Constructeurs*/
	/**
	 * Construit une instance de pile de carte.
	 */
	public Pile(){
		this.pile = new Stack<Carte>(); 
	}
	
/*Méthodes*/
	/**
	 * Retourne une chaîne de caractères contenant les informations de la pile de Cartes
	 */
	public String toString(){
		String str = new String();
		str += "Contenu de la pile : \n";
		for(Carte c : this.pile)
			str += c.toString()+'\n';
		
		return str;	
	}
	
	/**
	 * Ajoute une carte au dessus de la pile
	 * @param c		Carte à ajouter
	 */
	public void ajouter(Carte c){
			this.pile.push(c);
			this.setChanged();
			this.notifyObservers(c);
	}
	
	/**
	 * Vide la pile de carte
	 * @return Liste des cartes récupérées
	 */
	public ArrayList<Carte> vider(){
		ArrayList<Carte> cartes = new ArrayList<Carte>();
		for (Carte c : this.pile)
			cartes.add(c);
		this.pile.removeAllElements();
		this.setChanged();
		this.notifyObservers();

		return cartes;
	}
	
	/**
	 * Retourne la première carte de la pile sans la retirer 
	 * @return Première carte de la pile
	 */
	public Carte premiereCarte(){
		if(this.pile.size() >= 1)
			return this.pile.peek();
		
		return null;
	}
	
	/**
	 * Vérifie si la pile est vide.
	 * @return True si la pile est vide sinon False 
	 */
	public boolean estVide(){
		return this.pile.empty();
	}

	/**
	 * Retourne le nombre de cartes de la pile
	 * @return Nombre de cartes de la pile.
	 */
	public int taille(){
		return this.pile.size();
	}
	
}
