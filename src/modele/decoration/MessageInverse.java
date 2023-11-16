package modele.decoration;

import modele.Message;

public class MessageInverse extends Message {

	protected Message message;
	protected String inverse;
	
	public MessageInverse(Message message) {
		this.message = message;
		this.Inverser();
	}
	private void Inverser() {
		StringBuilder inverseur = new StringBuilder(this.message.getTexte());
		this.inverse = inverseur.reverse().toString();
	}
	public String getTexte() {
		return this.inverse;
	}
	public void setTexte(String texte) {
		this.message.setTexte(texte);
		this.Inverser();
	}
	public String getAuteur() {
		return message.getAuteur();
	}
	public void setAuteur(String auteur) {
		this.message.setAuteur(auteur);
	}

}
