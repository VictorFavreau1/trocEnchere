package fr.eni.jee.enchere.bo;

import java.time.LocalDateTime;

public class Article {
	
	private int idArticle;
	private String article;
	private String description;
	private LocalDateTime dateDebut;
	private LocalDateTime dateFin;
	private int prix;
	private int prix_vente;
	private int idVendeur;
	private int categorie;
	private String etat = "CR";
	private String image;
	public User user;
	public Categorie categories;
	
	
	public Categorie getCategories() {
		return categories;
	}


	public void setCategories(Categorie categories) {
		this.categories = categories;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Enchere getEnchere() {
		return enchere;
	}


	public Enchere enchere;
	
	
	



	public Article(String article, String description, LocalDateTime dateDebut2, LocalDateTime dateFin2, int prix, int idVendeur,
			int categorie, String etat, String image) {
		this.article = article;
		this.description = description;
		this.dateDebut = dateDebut2;
		this.dateFin = dateFin2;
		this.prix = prix;
		this.idVendeur = idVendeur;
		this.categorie = categorie;
		this.etat = etat;
		this.image = image;
	}


	public Article(int idArticle, String article, String description, LocalDateTime dateDebut, LocalDateTime dateFin, int prix,
			int prix_vente, int idVendeur, int categorie, String etat, String image) {
		super();
		this.idArticle = idArticle;
		this.article = article;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
		this.prix_vente = prix_vente;
		this.idVendeur = idVendeur;
		this.categorie = categorie;
		this.etat = etat;
		this.image = image;
	}

	public Article(int idArticle, String article, String description, LocalDateTime dateDebut, LocalDateTime dateFin,
			int prix, int idVendeur, int categorie, String etat, String image) {
		super();
		this.idArticle = idArticle;
		this.article = article;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
		this.idVendeur = idVendeur;
		this.categorie = categorie;
		this.etat = etat;
		this.image = image;
	}




	public Article(String article, LocalDateTime dateFin,String image,  int prix_vente, int idVendeur , User user) {
		super();
		this.image = image;
		this.article = article;
		this.dateFin = dateFin;
		this.prix_vente = prix_vente;
		this.idVendeur = idVendeur;
		this.user = user;
		//this.enchere = enchere;
	}

	public Article(int idArticle, String article, String description, LocalDateTime dateFin, int prix_vente,
			int idVendeur, String image, User user) {
		super();
		this.idArticle = idArticle;
		this.article = article;
		this.description = description;
		this.dateFin = dateFin;
		this.prix_vente = prix_vente;
		this.idVendeur = idVendeur;
		this.image = image;
		this.user = user;

	}


	public Article(int no_article, String nom_article, LocalDateTime date_fin_enchere, String image, int montant_enchere, int no_utilisateur,
			User user) {
		this.idArticle = no_article;
		this.article = nom_article;
		this.dateFin = date_fin_enchere;
		this.image = image;
		this.idVendeur = no_utilisateur;
		this.user = user;
	}

	public Article(int no_article, int prix, String nom_article,String Description, LocalDateTime date_fin_enchere, String image, int montant_enchere, int no_utilisateur,
			User user, Categorie categories) {
		this.idArticle = no_article;
		this.article = nom_article;
		this.dateFin = date_fin_enchere;
		this.image = image;
		this.idVendeur = no_utilisateur;
		this.user = user;
		this.categories = categories;
		this.description = Description;
		this.prix = prix;
	}

	public int getIdArticle() {
		return idArticle;
	}


	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}


	public String getArticle() {
		return article;
	}


	public void setArticle(String article) {
		this.article = article;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	public int getPrix_vente() {
		return prix_vente;
	}


	public void setPrix_vente(int prix_vente) {
		this.prix_vente = prix_vente;
	}


	public int getIdVendeur() {
		return idVendeur;
	}


	public void setIdVendeur(int idVendeur) {
		this.idVendeur = idVendeur;
	}


	


	public LocalDateTime getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}


	public LocalDateTime getDateFin() {
		return dateFin;
	}


	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}


	public int getCategorie() {
		return categorie;
	}


	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public void setEnchere(Enchere enchere2) {
		this.enchere = enchere2;
		
	}
	
	
	

}
