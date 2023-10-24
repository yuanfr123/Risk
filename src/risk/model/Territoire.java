package risk.model;

public class Territoire {

	// Attributs
	private String nom;
	private int numero;
	private int nbRegiments;
	private Joueur occupant;


	// Constructeur
	public Territoire(String nom, int numero) {
		super();
		this.nom = nom;
		this.numero = numero;
		this.nbRegiments = nbRegiments;
		this.occupant = occupant;
	}
	
	// Getter and setter
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNbRegiments() {
		return nbRegiments;
	}
	public void setNbRegiments(int nbRegiments) {
		this.nbRegiments = nbRegiments;
	}
	public Joueur getOccupant() {
		return occupant;
	}
	public void setOccupant(Joueur occupant) {
		this.occupant = occupant;
	}
}