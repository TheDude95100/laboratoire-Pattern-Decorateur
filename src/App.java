import modele.Message;
import modele.decoration.MessageCode;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message message = new Message();
		
		message.setTexte("Test");
		MessageCode msgCode = new MessageCode(message);
		System.out.println(msgCode.getEncodage());
		}

}
