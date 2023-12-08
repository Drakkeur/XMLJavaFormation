package exercice2amine;

import java.time.LocalDate;

public class CompteBancaire {

	private Integer numCompte;
	private String nomProprietaire;
	private Double solde;
	private LocalDate dateCreation;
	private String typeCompte;
	
	public Integer getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(Integer numCompte) {
		this.numCompte = numCompte;
	}
	public CompteBancaire(Integer numCompte, String nomProprietaire, Double solde, LocalDate dateCreation,
			String typeCompte) {
		super();
		this.numCompte = numCompte;
		this.nomProprietaire = nomProprietaire;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.typeCompte = typeCompte;
	}
	public String getNomProprietaire() {
		return nomProprietaire;
	}
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	
}
