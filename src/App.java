import modele.Message;
import modele.decoration.MessageCode;
import modele.decoration.MessageFullCap;
import modele.decoration.MessageInverse;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message message = new Message();
		
		message.setTexte("Test");
		MessageCode msgCode = new MessageCode(message);
		MessageInverse msgInverse = new MessageInverse(message);
		MessageFullCap msgFullCap = new MessageFullCap(message);
		System.out.println(msgCode.getEncodage());
		System.out.println(msgInverse.getInverse());
		System.out.println(msgFullCap.getCri());
		}

}
