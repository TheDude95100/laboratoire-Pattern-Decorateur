package modele;

public class Message {
	
	String texte;
	String auteur;
	public Message() {}
	
	public Message(String texte, String auteur) {
		super();
		this.texte = texte;
		this.auteur = auteur;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
