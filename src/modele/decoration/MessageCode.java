package modele.decoration;

import modele.Message;

public class MessageCode extends Message{

	protected Message message;
	protected String encodage;
	protected int cle = 2;
	
	public MessageCode(Message message) {
		this.message = message;
		this.encoder();
	}
	
	private void encoder() {
		String msgEncode ="";
		for(int i = 0; i<message.getTexte().length();i++) {
			char lettre = (char)((int)message.getTexte().charAt(i)+this.cle);
			msgEncode+=lettre;
		}
		this.encodage = msgEncode;
	}

	public String getEncodage() {
		return encodage;
	}

	public void setEncodage(String encodage) {
		this.encodage = encodage;
	}

	public int getCle() {
		return cle;
	}

	public void setCle(int cle) {
		this.cle = cle;
	}

}
