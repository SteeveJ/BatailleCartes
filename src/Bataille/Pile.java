package Bataille;
import java.util.Stack;

/**
 * Classe de gestion d'une pile de Cartes
 * @author Steeve Jerent / Tony Clonier
 */
public class Pile {
	
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
	 * Ajoute un carte au dessus de la pile
	 * @param c		Carte à ajouter
	 */
	public void ajouter(Carte c){
		if(this.pile.contains(c))
			this.pile.push(c);
	}
	
	/**
	 * Vide la pile de carte
	 * @return La copie de la pile supprimer
	 */
	public Stack<Carte> vider(){
		Stack<Carte> tmp = new Stack<Carte>();
		for (Carte c : this.pile)
			tmp.add(c);
		this.pile.removeAllElements();
		return tmp;
	}
	
	/**
	 * Retourne la première carte de la pile sans la retirer 
	 * @return La première carte de la pile
	 */
	public Carte premiereCarte(){
		return this.pile.peek();
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
	 * @return Le nombre de cartes de la pile.
	 */
	public int taille(){
		return this.pile.size();
	}
	
}
