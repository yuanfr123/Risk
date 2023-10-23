package risk.model;
import java.util.Date;

public class Joueur {
	// Attributs 
	private int id; 
	private String nom;
	private String prenom;
	private Date dtNaissance = new Date();
	private String statut;

	// Constructeur
	/**
	 * @param id
	 */
	public Joueur(int id) {
		this.id = id;
	}
	
	// Methodes
	/** @return int */
	public int getId() {
		return id;
	}
	/** @param id */
	public void setId(int id) {
		this.id = id;
	}
	/** @return String */
	public String getNom() {
		return nom;
	}
	/** @param nom */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** @return String */
	public String getPrenom() {
		return prenom;
	}
	/** @param prenom */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/** @return Date */
	public Date getDtNaissance() {
		return dtNaissance;
	}
	/** @param dtNaissance */
	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}	
}
