package sim3105;

public class Speak {

	public static void main(String[] args) {
		Speak speakIT = new Tell();
		
		Tell tellIt = new Tell();

//        speakIT.tellItLikeItIs(); //ERROR COMPILACION
//        (Truth)speakIT.tellItLikeItIs(); //ERROR COMPILACION
          ((Truth)speakIT).tellItLikeItIs();
          tellIt.tellItLikeItIs();
//        (Truth)tellIt.tellItLikeItIs(); //ERROR COMPILACION
//        ((Speak)tellIt).tellItLikeItIs();
	}
}

class Tell extends Speak implements Truth {
	@Override
	public void tellItLikeItIs() {
		System.out.println("Right on!");
	}
}

interface Truth {
	public void tellItLikeItIs();
}
