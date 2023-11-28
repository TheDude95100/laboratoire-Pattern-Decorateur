package modele.decoration;

import modele.Message;

public class MessageFullCap extends Message{
	
	protected Message message;
	protected String cri;

	public MessageFullCap(Message message) {
		this.message = message;
		this.crier();
	}
	
	private void crier() {
		this.cri = message.getTexte().toUpperCase();
	}

	public String getCri() {
		return cri;
	}

	public void setCri(String cri) {
		this.cri = cri;
	}
	public String getTexte() {
		return this.cri;
	}
	public void setTexte(String texte) {
		this.message.setTexte(texte);
		this.crier();
	}
	public String getAuteur() {
		return message.getAuteur();
	}
	public void setAuteur(String auteur) {
		this.message.setAuteur(auteur);
	}
}
