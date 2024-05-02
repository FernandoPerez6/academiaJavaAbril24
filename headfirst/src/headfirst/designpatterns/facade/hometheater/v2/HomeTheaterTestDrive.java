package headfirst.designpatterns.facade.hometheater.v2;

public class HomeTheaterTestDrive {
	//CLIENTE
	public static void main(String[] args) {
		
		System.out.println("V2");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacadeImpl();
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		System.out.println("*********************");
		homeTheater.endMovie();
	}
	
}
